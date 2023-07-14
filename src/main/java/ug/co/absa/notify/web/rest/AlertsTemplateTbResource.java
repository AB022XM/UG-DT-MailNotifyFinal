package ug.co.absa.notify.web.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import tech.jhipster.web.util.HeaderUtil;
import tech.jhipster.web.util.ResponseUtil;
import ug.co.absa.notify.domain.AlertsTemplateTb;
import ug.co.absa.notify.repository.AlertsTemplateTbRepository;
import ug.co.absa.notify.web.rest.errors.BadRequestAlertException;

/**
 * REST controller for managing {@link ug.co.absa.notify.domain.AlertsTemplateTb}.
 */
@RestController
@RequestMapping("/api")
@Transactional
public class AlertsTemplateTbResource {

    private final Logger log = LoggerFactory.getLogger(AlertsTemplateTbResource.class);

    private static final String ENTITY_NAME = "alertsTemplateTb";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final AlertsTemplateTbRepository alertsTemplateTbRepository;

    public AlertsTemplateTbResource(AlertsTemplateTbRepository alertsTemplateTbRepository) {
        this.alertsTemplateTbRepository = alertsTemplateTbRepository;
    }

    /**
     * {@code POST  /alerts-template-tbs} : Create a new alertsTemplateTb.
     *
     * @param alertsTemplateTb the alertsTemplateTb to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new alertsTemplateTb, or with status {@code 400 (Bad Request)} if the alertsTemplateTb has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/alerts-template-tbs")
    public ResponseEntity<AlertsTemplateTb> createAlertsTemplateTb(@RequestBody AlertsTemplateTb alertsTemplateTb)
        throws URISyntaxException {
        log.debug("REST request to save AlertsTemplateTb : {}", alertsTemplateTb);
        if (alertsTemplateTb.getId() != null) {
            throw new BadRequestAlertException("A new alertsTemplateTb cannot already have an ID", ENTITY_NAME, "idexists");
        }
        AlertsTemplateTb result = alertsTemplateTbRepository.save(alertsTemplateTb);
        return ResponseEntity
            .created(new URI("/api/alerts-template-tbs/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, false, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /alerts-template-tbs/:id} : Updates an existing alertsTemplateTb.
     *
     * @param id the id of the alertsTemplateTb to save.
     * @param alertsTemplateTb the alertsTemplateTb to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated alertsTemplateTb,
     * or with status {@code 400 (Bad Request)} if the alertsTemplateTb is not valid,
     * or with status {@code 500 (Internal Server Error)} if the alertsTemplateTb couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/alerts-template-tbs/{id}")
    public ResponseEntity<AlertsTemplateTb> updateAlertsTemplateTb(
        @PathVariable(value = "id", required = false) final UUID id,
        @RequestBody AlertsTemplateTb alertsTemplateTb
    ) throws URISyntaxException {
        log.debug("REST request to update AlertsTemplateTb : {}, {}", id, alertsTemplateTb);
        if (alertsTemplateTb.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, alertsTemplateTb.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!alertsTemplateTbRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        AlertsTemplateTb result = alertsTemplateTbRepository.save(alertsTemplateTb);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, alertsTemplateTb.getId().toString()))
            .body(result);
    }

    /**
     * {@code PATCH  /alerts-template-tbs/:id} : Partial updates given fields of an existing alertsTemplateTb, field will ignore if it is null
     *
     * @param id the id of the alertsTemplateTb to save.
     * @param alertsTemplateTb the alertsTemplateTb to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated alertsTemplateTb,
     * or with status {@code 400 (Bad Request)} if the alertsTemplateTb is not valid,
     * or with status {@code 404 (Not Found)} if the alertsTemplateTb is not found,
     * or with status {@code 500 (Internal Server Error)} if the alertsTemplateTb couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/alerts-template-tbs/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<AlertsTemplateTb> partialUpdateAlertsTemplateTb(
        @PathVariable(value = "id", required = false) final UUID id,
        @RequestBody AlertsTemplateTb alertsTemplateTb
    ) throws URISyntaxException {
        log.debug("REST request to partial update AlertsTemplateTb partially : {}, {}", id, alertsTemplateTb);
        if (alertsTemplateTb.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, alertsTemplateTb.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!alertsTemplateTbRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<AlertsTemplateTb> result = alertsTemplateTbRepository
            .findById(alertsTemplateTb.getId())
            .map(existingAlertsTemplateTb -> {
                if (alertsTemplateTb.getAlertTemplateId() != null) {
                    existingAlertsTemplateTb.setAlertTemplateId(alertsTemplateTb.getAlertTemplateId());
                }
                if (alertsTemplateTb.getAlertroductId() != null) {
                    existingAlertsTemplateTb.setAlertroductId(alertsTemplateTb.getAlertroductId());
                }
                if (alertsTemplateTb.getAlertTemplatename() != null) {
                    existingAlertsTemplateTb.setAlertTemplatename(alertsTemplateTb.getAlertTemplatename());
                }
                if (alertsTemplateTb.getAlertTemplateDetails() != null) {
                    existingAlertsTemplateTb.setAlertTemplateDetails(alertsTemplateTb.getAlertTemplateDetails());
                }
                if (alertsTemplateTb.getAlertTemplateStatus() != null) {
                    existingAlertsTemplateTb.setAlertTemplateStatus(alertsTemplateTb.getAlertTemplateStatus());
                }
                if (alertsTemplateTb.getAlertTemplateretries() != null) {
                    existingAlertsTemplateTb.setAlertTemplateretries(alertsTemplateTb.getAlertTemplateretries());
                }
                if (alertsTemplateTb.getAlertTemplateTimestamp() != null) {
                    existingAlertsTemplateTb.setAlertTemplateTimestamp(alertsTemplateTb.getAlertTemplateTimestamp());
                }
                if (alertsTemplateTb.getAlertTemplatepostedby() != null) {
                    existingAlertsTemplateTb.setAlertTemplatepostedby(alertsTemplateTb.getAlertTemplatepostedby());
                }
                if (alertsTemplateTb.getAlertTemplatepostedDate() != null) {
                    existingAlertsTemplateTb.setAlertTemplatepostedDate(alertsTemplateTb.getAlertTemplatepostedDate());
                }
                if (alertsTemplateTb.getAlertTmpFreeField1() != null) {
                    existingAlertsTemplateTb.setAlertTmpFreeField1(alertsTemplateTb.getAlertTmpFreeField1());
                }
                if (alertsTemplateTb.getAlertTmpFreeField2() != null) {
                    existingAlertsTemplateTb.setAlertTmpFreeField2(alertsTemplateTb.getAlertTmpFreeField2());
                }
                if (alertsTemplateTb.getAlertTmpFreeField2ContentType() != null) {
                    existingAlertsTemplateTb.setAlertTmpFreeField2ContentType(alertsTemplateTb.getAlertTmpFreeField2ContentType());
                }
                if (alertsTemplateTb.getAlertTmpFreeField3() != null) {
                    existingAlertsTemplateTb.setAlertTmpFreeField3(alertsTemplateTb.getAlertTmpFreeField3());
                }
                if (alertsTemplateTb.getAlertTmpFreeField4() != null) {
                    existingAlertsTemplateTb.setAlertTmpFreeField4(alertsTemplateTb.getAlertTmpFreeField4());
                }
                if (alertsTemplateTb.getAlertTmpFreeField5() != null) {
                    existingAlertsTemplateTb.setAlertTmpFreeField5(alertsTemplateTb.getAlertTmpFreeField5());
                }
                if (alertsTemplateTb.getAlertTmpFreeField6() != null) {
                    existingAlertsTemplateTb.setAlertTmpFreeField6(alertsTemplateTb.getAlertTmpFreeField6());
                }
                if (alertsTemplateTb.getAlertTmpFreeField7() != null) {
                    existingAlertsTemplateTb.setAlertTmpFreeField7(alertsTemplateTb.getAlertTmpFreeField7());
                }
                if (alertsTemplateTb.getAlertTmpFreeField8() != null) {
                    existingAlertsTemplateTb.setAlertTmpFreeField8(alertsTemplateTb.getAlertTmpFreeField8());
                }
                if (alertsTemplateTb.getTimestamp() != null) {
                    existingAlertsTemplateTb.setTimestamp(alertsTemplateTb.getTimestamp());
                }
                if (alertsTemplateTb.getIsActive() != null) {
                    existingAlertsTemplateTb.setIsActive(alertsTemplateTb.getIsActive());
                }

                return existingAlertsTemplateTb;
            })
            .map(alertsTemplateTbRepository::save);

        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, alertsTemplateTb.getId().toString())
        );
    }

    /**
     * {@code GET  /alerts-template-tbs} : get all the alertsTemplateTbs.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of alertsTemplateTbs in body.
     */
    @GetMapping("/alerts-template-tbs")
    public List<AlertsTemplateTb> getAllAlertsTemplateTbs() {
        log.debug("REST request to get all AlertsTemplateTbs");
        return alertsTemplateTbRepository.findAll();
    }

    /**
     * {@code GET  /alerts-template-tbs/:id} : get the "id" alertsTemplateTb.
     *
     * @param id the id of the alertsTemplateTb to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the alertsTemplateTb, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/alerts-template-tbs/{id}")
    public ResponseEntity<AlertsTemplateTb> getAlertsTemplateTb(@PathVariable UUID id) {
        log.debug("REST request to get AlertsTemplateTb : {}", id);
        Optional<AlertsTemplateTb> alertsTemplateTb = alertsTemplateTbRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(alertsTemplateTb);
    }

    /**
     * {@code DELETE  /alerts-template-tbs/:id} : delete the "id" alertsTemplateTb.
     *
     * @param id the id of the alertsTemplateTb to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/alerts-template-tbs/{id}")
    public ResponseEntity<Void> deleteAlertsTemplateTb(@PathVariable UUID id) {
        log.debug("REST request to delete AlertsTemplateTb : {}", id);
        alertsTemplateTbRepository.deleteById(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, false, ENTITY_NAME, id.toString()))
            .build();
    }
}
