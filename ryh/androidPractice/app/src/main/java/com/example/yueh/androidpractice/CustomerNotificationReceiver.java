package com.example.yueh.androidpractice;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.widget.Toast;

import static android.content.Context.NOTIFICATION_SERVICE;

public class CustomerNotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String broadcastDataStr = intent.getStringExtra("txt");
        Toast.makeText(context,
                "接收到Broadcast，消息为：" + broadcastDataStr,
                Toast.LENGTH_SHORT).show();
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager mNotificationManager = (NotificationManager) DemoApplication.getInstance().getSystemService(NOTIFICATION_SERVICE);
            intent = new Intent(DemoApplication.getInstance(), MainActivity.class);
            PendingIntent pintent = PendingIntent.getActivity(DemoApplication.getInstance(), 0, intent, 0);
            String id = "channel_1";
            String description = "123";
            int importance = NotificationManager.IMPORTANCE_LOW;
            NotificationChannel mChannel = new NotificationChannel(id, "123", importance);
            mChannel.setDescription(description);
            mChannel.enableLights(true);
            mChannel.setLightColor(Color.RED);
            mChannel.enableVibration(true);
            mChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
            mNotificationManager.createNotificationChannel(mChannel);
            Notification notification = new Notification.Builder(DemoApplication.getInstance(), id).setContentTitle("Title")
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setContentTitle("您有一条新通知")
                    .setContentText(broadcastDataStr)
                    .setAutoCancel(true)
                    .setContentIntent(pintent)
                    .build();
            mNotificationManager.notify(1, notification);
        } else {
            NotificationCompat.Builder mBuilder =
                    new NotificationCompat.Builder(DemoApplication.getInstance(), "adsdsdsd")
                            .setSmallIcon(R.mipmap.ic_launcher)
                            .setContentTitle("Title")
                            .setContentText(intent.getStringExtra("txt") + "");
            Intent resultIntent = new Intent(DemoApplication.getInstance(), MainActivity.class);
            TaskStackBuilder stackBuilder = TaskStackBuilder.create(DemoApplication.getInstance());
            stackBuilder.addParentStack(MainActivity.class);
            stackBuilder.addNextIntent(resultIntent);
            PendingIntent resultPendingIntent =
                    stackBuilder.getPendingIntent(
                            0,
                            PendingIntent.FLAG_UPDATE_CURRENT
                    );
            mBuilder.setContentIntent(resultPendingIntent);
            NotificationManager mNotificationManager =
                    (NotificationManager) DemoApplication.getInstance().getSystemService(NOTIFICATION_SERVICE);
            mNotificationManager.notify(0, mBuilder.build());
        }
    }
}
