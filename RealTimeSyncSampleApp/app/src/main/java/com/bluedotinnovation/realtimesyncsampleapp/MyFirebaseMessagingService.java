package com.bluedotinnovation.realtimesyncsampleapp;

import android.content.Intent;

import com.bluedotinnovation.realtimesyncsampleapp.fragments.LogFragment;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


import java.util.Date;

import au.com.bluedot.point.net.engine.ServiceManager;


/**
 * Created by Bluedot Innovation on 05/10/16.
 */
public class MyFirebaseMessagingService extends FirebaseMessagingService{


    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        logInfo("Push received at: " + new Date().toString());
        ServiceManager serviceManager = ServiceManager.getInstance(this);
        serviceManager.notifyPushUpdate(remoteMessage.getData());

    }


    private void logInfo(String logInfo){
        Intent intent = new Intent();
        intent.setAction(LogFragment.TEXT_LOG_BROADCAST);
        intent.putExtra("logInfo", logInfo);
        sendBroadcast(intent);
    }
}
