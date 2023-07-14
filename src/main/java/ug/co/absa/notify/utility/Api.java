package ug.co.absa.notify.utility;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import ug.co.absa.notify.domain.models.AccountRequest;
import ug.co.absa.notify.domain.models.EmailApiResponse;
import ug.co.absa.notify.domain.models.EmailContent;
import ug.co.absa.notify.domain.models.ValidationResponse;

import java.util.concurrent.CompletableFuture;

public class Api {
    final  Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://ugpbhkmapp0002.corp.dsarena.com:19020/")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    final  Retrofit retrofit2 = new Retrofit.Builder()
        .baseUrl("https://ugpbhkmapp0002.corp.dsarena.com:5575/")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    APIClient apiClient = retrofit.create(APIClient.class);

    APIClient apiClient2 = retrofit2.create(APIClient.class);


    public CompletableFuture<EmailApiResponse> sendMail(EmailContent emailContent) {
        return apiClient.sendMail(emailContent);
    }

    public CompletableFuture<ValidationResponse> getCustomerEmail(AccountRequest accountRequest ) {
        return apiClient2.getCustomerEmail(accountRequest);
    }


}
