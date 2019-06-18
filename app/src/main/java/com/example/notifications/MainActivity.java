package com.example.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_notify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_notify=findViewById(R.id.notify);
        button_notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendNotification();

            }
        });
    }
    static int  id= 1;
    NotificationManager notificationManager;
    private void sendNotification() {

        NotificationCompat.Builder nbuild=new NotificationCompat.Builder(this)
                .setContentTitle("APP")
                .setContentText("NotificationManager")
                .setSmallIcon(R.drawable.ic_launcher_background);
        notificationManager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(id,nbuild.build());
        id++;

    }
}
