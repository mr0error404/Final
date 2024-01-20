package com.example.finalnotifacation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

                    NotificationChannel channel1 = new NotificationChannel("1","ABC" , NotificationManager.IMPORTANCE_HIGH);
                    channel1.enableLights(true);
                    channel1.enableVibration(true);
                    channel1.setName("Channel 1 ");
                    channel1.setDescription("NewS Channel 123");


                    String x="dsgnfmhg,hm.∆.tRYDJKUFJHGHJ";

                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    PendingIntent pendingIntent =  PendingIntent.getActivity(MainActivity.this,0,intent,PendingIntent.FLAG_IMMUTABLE);

                    Notification notification1 = new Notification.Builder(MainActivity.this,"1")
                            .setSmallIcon(R.drawable.error)
                            .setContentTitle("Hello")
                            .setContentText("111111111111")
                            .setAutoCancel(true)
                            .setContentIntent(pendingIntent)
                            .addAction(R.drawable.open,"OPEN",pendingIntent)
                            .setStyle(new Notification.BigTextStyle().bigText(x))
                            .addAction(R.drawable.close , "Close",pendingIntent)
                            .build();

                    NotificationManager notificationManager = getSystemService(NotificationManager.class);
                    notificationManager.createNotificationChannel(channel1);

                    notificationManager.notify(4,notification1);
//                    notificationManager.notify(5,notification1);
                }
            }
        });
    }
}