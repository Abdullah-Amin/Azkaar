package com.example.azkaar.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.azkaar.databinding.ActivityPrayerTimeBinding;
import com.example.azkaar.network.PrayerSingleton;
import com.example.azkaar.receivers.PrayerAlarmReceiver;
import com.example.azkaar.response.PrayerTimeResponse;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PrayerTimeActivity extends AppCompatActivity {

    private ActivityPrayerTimeBinding binding;

    private Calendar calendar;
    private AlarmManager alarmManager;
    private PendingIntent pendingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrayerTimeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        createNotificationChannel();

        PrayerSingleton.client().getPrayerTime(getDateTime())
                .enqueue(new Callback<PrayerTimeResponse>() {
                    @Override
                    public void onResponse(Call<PrayerTimeResponse> call, Response<PrayerTimeResponse> response) {
                        if (response.isSuccessful()) {
                            Log.i("abdo", "onResponse: " + response.body().toString());
                            calendar = Calendar.getInstance();
                            setData(response);
                            setAlarm();


                        } else {
                            Log.i("abdo", "onResponse: " + response.message());
                        }
                    }

                    @Override
                    public void onFailure(Call<PrayerTimeResponse> call, Throwable t) {
                        Log.i("abdo", "onFailure: " + t.getLocalizedMessage());
                        Toast.makeText(PrayerTimeActivity.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                    }
                });
    }

    private void setAlarm() {
        alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(PrayerTimeActivity.this, PrayerAlarmReceiver.class);
        pendingIntent = PendingIntent.getBroadcast(PrayerTimeActivity.this, 0, intent, PendingIntent.FLAG_IMMUTABLE);
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
        Toast.makeText(PrayerTimeActivity.this, "Alarm Set", Toast.LENGTH_SHORT).show();
    }

    private void setData(Response<PrayerTimeResponse> response) {
        binding.fajrTV.setText(response.body().getData().get(getDay()).getTimings().getFajr().split(" ")[0]);
        setAlarmFor(response, "f");
        binding.dhuhrTV.setText(response.body().getData().get(getDay()).getTimings().getDhuhr().split(" ")[0]);
        setAlarmFor(response, "d");
        binding.asrTV.setText(response.body().getData().get(getDay()).getTimings().getAsr().split(" ")[0]);
        setAlarmFor(response, "a");
        binding.maghribTV.setText(response.body().getData().get(getDay()).getTimings().getMaghrib().split(" ")[0]);
        setAlarmFor(response, "m");
        binding.eshaaTV.setText(response.body().getData().get(getDay()).getTimings().getIsha().split(" ")[0]);
        setAlarmFor(response, "i");
    }

    public void setAlarmFor(Response<PrayerTimeResponse> response, String prayer){
        calendar = Calendar.getInstance();
        Integer hours = Integer.valueOf(response.body().getData().get(getDay()).getTimings().getFajr().split(" ")[0].split(":")[0]);
        Integer minutes = Integer.valueOf(response.body().getData().get(getDay()).getTimings().getFajr().split(" ")[0].split(":")[1]);



        calendar.set(Calendar.MINUTE, (minutes * 60 * 1000));

        Log.i("abdo", "setAlarmFor: " + hours);
        Log.i("abdo", "setAlarmFor: " + minutes);
        Log.i("abdo", "setAlarmFor: " + ((hours * 60 * 60 * 1000) + (minutes * 60 * 1000)));

        if (hours > calendar.get(Calendar.HOUR_OF_DAY)){

            Long realHours = (long) (calendar.get(Calendar.HOUR_OF_DAY) * 60 * 60 * 1000);
            Long realMinutes = (long) (calendar.get(Calendar.MINUTE) * 60 * 1000);

            Long realTime = (realHours + realMinutes) - ((hours * 60 * 60 * 1000) + (minutes * 60 * 1000));

            Integer newHours = Math.toIntExact(realTime / 1000 / 60 / 60);
            Integer newMinutes = Math.toIntExact((realTime / 1000 / 60 / 60) % 60);

            calendar.set(Calendar.HOUR_OF_DAY, newHours);
            calendar.set(Calendar.MINUTE, newMinutes);
        }

//        Long c = calendar.getTimeInMillis();
//        Log.i("abdo", "getDateTime: " + calendar.get(Calendar.HOUR_OF_DAY));
//        SimpleDateFormat df = new SimpleDateFormat("HH:mm", Locale.getDefault());



        calendar.set(Calendar.HOUR_OF_DAY, (hours * 60 * 60 * 1000));
        calendar.set(Calendar.MINUTE, (minutes * 60 * 1000));

//        switch(prayer){
//            case "f":
////                Integer millis = (hours * 60 * 60 * 1000) + (minutes * 60 * 1000);
//
//                break;
//            case "d":
////                Integer millis = (hours * 60 * 60 * 1000) + (minutes * 60 * 1000);
//                calendar.set(Calendar.HOUR_OF_DAY, (hours * 60 * 60 * 1000));
//                calendar.set(Calendar.MINUTE, (minutes * 60 * 1000));
//                break;
//            case "a":
////                Integer millis = (hours * 60 * 60 * 1000) + (minutes * 60 * 1000);
//                calendar.set(Calendar.HOUR_OF_DAY, (hours * 60 * 60 * 1000));
//                calendar.set(Calendar.MINUTE, (minutes * 60 * 1000));
//                break;
//            case "m":
////                Integer millis = (hours * 60 * 60 * 1000) + (minutes * 60 * 1000);
//                calendar.set(Calendar.HOUR_OF_DAY, (hours * 60 * 60 * 1000));
//                calendar.set(Calendar.MINUTE, (minutes * 60 * 1000));
//                break;
//            default:
////                Integer millis = (hours * 60 * 60 * 1000) + (minutes * 60 * 1000);
//                calendar.set(Calendar.HOUR_OF_DAY, (hours * 60 * 60 * 1000));
//                calendar.set(Calendar.MINUTE, (minutes * 60 * 1000));
//                break;
    }

    private int getDay() {
        Date c = Calendar.getInstance().getTime();
        Log.i("abdo", "getDateTime: " + c);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM", Locale.getDefault());
        String[] day = df.format(c).split("/");
        Log.i("abdo", "getDateTime: " + day[0]);
        return Integer.parseInt(day[0]);
    }

    private String getDateTime() {
        Date c = Calendar.getInstance().getTime();
        Log.i("abdo", "getDateTime: " + c);
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM", Locale.getDefault());
        Log.i("abdo", "getDateTime: " + df.format(c));
        return df.format(c);
    }

    private void createNotificationChannel(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            CharSequence name = "prayer";
            String desc = "Channel for Alarm Manager";
            int imp = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel("Prayer channel", name, imp);
            channel.setDescription(desc);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
}