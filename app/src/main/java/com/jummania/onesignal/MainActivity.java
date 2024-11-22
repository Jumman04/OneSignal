package com.jummania.onesignal;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.onesignal.OneSignal;
import com.onesignal.notifications.INotificationClickEvent;
import com.onesignal.notifications.INotificationClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OneSignal.getNotifications().addClickListener(new INotificationClickListener() {
            @Override
            public void onClick(@NonNull INotificationClickEvent iNotificationClickEvent) {
                // Handle notification click here
                // You can navigate to a new activity or perform any other action
                // For example, you can start a new activity:
                // Intent intent = new Intent(MainActivity.this, NewActivity.class);
                // startActivity(intent);
            }
        });
    }
}