package com.example.babynews.notifications;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public abstract class APIService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:Key=AAAASmMkB1w:APA91bE9wog9k0xS3NcbdQEQRl5i71ATtCsMRSRL8YLiSQDCrksUiGaPrLG5cLYkuk4BpKDaGJp5XrPnI9VJS_A6GovArKdHuOiEBVWwenouT20Jhv_F_21xIyXcygokKY54yjwoHWu4"

    })

    @POST("from/send")
    abstract Call<Response> sendNotification(@Body Sender body);
}
