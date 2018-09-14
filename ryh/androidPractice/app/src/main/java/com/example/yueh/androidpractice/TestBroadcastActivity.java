package com.example.yueh.androidpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TestBroadcastActivity extends AppCompatActivity {
    private EditText mBroadcastEditTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_broadcast);
        mBroadcastEditTxt = findViewById(R.id.broadcast_context_edit);
        findViewById(R.id.send_broadcast_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendNotificationBroadcast();
            }
        });
    }

    private void sendNotificationBroadcast() {
        Intent intent = new Intent("com.example.yueh.androidpractice.NOTIFICATION_BROADCAST");
        intent.putExtra("txt",mBroadcastEditTxt.getText().toString());
        sendBroadcast(intent);
    }
}
