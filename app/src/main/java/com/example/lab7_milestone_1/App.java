package com.example.lab7_milestone_1;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.Manifest;
import android.os.Build;
import android.view.View;

public class App extends Application {
    public static final String CHANNEL_1_ID = "channel1";

    public static final String CHANNEL_2_ID = "channel2";

    @Override
    public void onCreate(){
        super.onCreate();

        createNotificationChannels();
        secondCreateNotificationChannels();
    }
    private void createNotificationChannels(){
        if (Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O){

            NotificationChannel channel1 = new NotificationChannel(
                        CHANNEL_1_ID,
                        "Channel 1",
                        NotificationManager.IMPORTANCE_HIGH
                );

            channel1.setDescription("This is Channel 1");

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel1);
        }
    }

    private void secondCreateNotificationChannels(){
        if (Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O){

            NotificationChannel channel2 = new NotificationChannel(
                    CHANNEL_2_ID,
                    "Channel 2",
                    NotificationManager.IMPORTANCE_LOW
            );

            channel2.setDescription("This is Channel 2");

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel2);
        }
    }
}
