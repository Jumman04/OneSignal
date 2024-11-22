package com.jummania.onesignal;

import com.onesignal.OneSignal;

/**
 * * Created by Jummania on 22,November,2024.
 * * Email: sharifuddinjumman@gmail.com
 * * Dhaka, Bangladesh.
 */
public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.initWithContext(this, "ONESIGNAL_APP_ID");
    }
}
