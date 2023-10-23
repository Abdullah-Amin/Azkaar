package com.example.azkaar.network;

import com.example.azkaar.response.PrayerTimeResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PrayerTimeService {

    @GET("{date}?city=Mecca&country=KSA&method=4")
    Call<PrayerTimeResponse> getPrayerTime(@Path("date") String dateInYM);
}
