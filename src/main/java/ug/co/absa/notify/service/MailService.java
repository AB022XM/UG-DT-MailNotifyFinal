package ug.co.absa.notify.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;
import tech.jhipster.config.JHipsterProperties;
import ug.co.absa.notify.domain.AlertsTb;
import ug.co.absa.notify.domain.User;
import ug.co.absa.notify.domain.models.EmailApiResponse;
import ug.co.absa.notify.domain.models.EmailContent;
import ug.co.absa.notify.repository.AlertsTbRepository;
import ug.co.absa.notify.utility.APIClient;

@Service
public class MailService {

    private final Logger log = LoggerFactory.getLogger(MailService.class);

    private static final String USER = "user";

    private static final String BASE_URL = "baseUrl";

    private final JHipsterProperties jHipsterProperties;

    private final APIClient apiClient;

    private  final AlertsTbRepository alertsTbRepository;

    private final JavaMailSender javaMailSender;

    private final MessageSource messageSource;

    private final SpringTemplateEngine templateEngine;

    public MailService(
        JHipsterProperties jHipsterProperties,
        JavaMailSender javaMailSender,
        MessageSource messageSource,
        SpringTemplateEngine templateEngine,
        APIClient apiClient,
        AlertsTbRepository alertsTbRepository
    ) {
        this.jHipsterProperties = jHipsterProperties;
        this.javaMailSender = javaMailSender;
        this.messageSource = messageSource;
        this.templateEngine = templateEngine;
        this.apiClient = apiClient;
        this.alertsTbRepository = alertsTbRepository;

    }

    @Async
    public void sendEmail(String to, String subject, String content, boolean isMultipart, boolean isHtml) {
        log.debug(
            "Send email[multipart '{}' and html '{}'] to '{}' with subject '{}' and content={}",
            isMultipart,
            isHtml,
            to,
            subject,
            content
        );

        // Prepare message using a Spring helper
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper message = new MimeMessageHelper(mimeMessage, isMultipart, StandardCharsets.UTF_8.name());
            message.setTo(to);
            message.setFrom(jHipsterProperties.getMail().getFrom());
            message.setSubject(subject);
            message.setText(content, isHtml);
            javaMailSender.send(mimeMessage);
            log.debug("Sent email to User '{}'", to);
        } catch (MailException | MessagingException e) {
            log.warn("Email could not be sent to user '{}'", to, e);
        }
    }

    @Async
    public void sendEmailFromTemplate(User user, String templateName, String titleKey) {
        if (user.getEmail() == null) {
            log.debug("Email doesn't exist for user '{}'", user.getLogin());
            return;
        }
        Locale locale = Locale.forLanguageTag(user.getLangKey());
        Context context = new Context(locale);
        context.setVariable(USER, user);
        context.setVariable(BASE_URL, jHipsterProperties.getMail().getBaseUrl());
        String content = templateEngine.process(templateName, context);
        String subject = messageSource.getMessage(titleKey, null, locale);
        sendEmail(user.getEmail(), subject, content, false, true);
    }

    @Async
    public void sendActivationEmail(User user) {
        log.debug("Sending activation email to '{}'", user.getEmail());
        sendEmailFromTemplate(user, "mail/activationEmail", "email.activation.title");
    }

    @Async
    public void sendCreationEmail(User user) {
        log.debug("Sending creation email to '{}'", user.getEmail());
        sendEmailFromTemplate(user, "mail/creationEmail", "email.activation.title");
    }

    @Async
    public void sendPasswordResetMail(User user) {
        log.debug("Sending password reset email to '{}'", user.getEmail());
        sendEmailFromTemplate(user, "mail/passwordResetEmail", "email.reset.title");
    }

    @Scheduled(fixedDelay = 2, initialDelay = 2,timeUnit = TimeUnit.MINUTES)
    public void sendAllPendingEmails() throws URISyntaxException {
        log.debug("Picking all pending emails");
        AlertsTb pendingAlerts = alertsTbRepository.findOneById(UUID.fromString("7a1f2d64-20b5-11ee-be56-0242ac120002"));
         log.debug("Found {} pending alerts", pendingAlerts.toString());

        // get all records from Alerts table
        String subject = "ABSA UMEME TOKEN NOTIFICATION";

        log.debug("Sending all pending emails");
        sendAllPendingEmailsTestMethod(pendingAlerts);

    }

    public void sendAllPendingEmails(List<AlertsTb> alertsTbs) throws URISyntaxException {
        alertsTbs.forEach(alertsTb -> {

            log.debug(" SENDING: "+alertsTb.toString());

            EmailContent emailContent=   new  EmailContent();
            emailContent.setEmailSubject(alertsTb.getAlertFreeField2());
            emailContent.setEmailBody(alertsTb.getAlertMessage());
            emailContent.setEmailFrom("noreply@absa.za");
            emailContent.setIsSchedules(true);


            CompletableFuture<EmailApiResponse> apiResponse= apiClient.sendMail(emailContent);

        });
    }

    public void sendAllPendingEmailsTestMethod(AlertsTb alertsTb) throws URISyntaxException {

        log.debug(" SENDING: TEST ");
        EmailContent emailContent=   new  EmailContent();
        emailContent.setEmailSubject(alertsTb.getAlertFreeField2());
        emailContent.setEmailBody(alertsTb.getAlertMessage());
        emailContent.setEmailFrom("noreply@absa.za");
        emailContent.setIsSchedules(true);
        CompletableFuture<EmailApiResponse> apiResponse= apiClient.sendMail(emailContent);
        alertsTbRepository.deleteAll();


    }

}
