package ug.co.absa.notify.utility;

import retrofit.http.Body;
import retrofit.http.Headers;
import retrofit.http.POST;
import ug.co.absa.notify.domain.models.AccountRequest;
import ug.co.absa.notify.domain.models.EmailApiResponse;
import ug.co.absa.notify.domain.models.EmailContent;
import ug.co.absa.notify.domain.models.ValidationResponse;

import java.util.concurrent.CompletableFuture;

public interface APIClient {
    @POST("api/v1/SendMail")
    @Headers("accept: application/json")
    CompletableFuture<EmailApiResponse> sendMail(@Body EmailContent emailContent);

    @POST("api/v1/validate")
    @Headers("accept: application/json")
    CompletableFuture<ValidationResponse> getCustomerEmail(@Body AccountRequest accountRequest);
}
