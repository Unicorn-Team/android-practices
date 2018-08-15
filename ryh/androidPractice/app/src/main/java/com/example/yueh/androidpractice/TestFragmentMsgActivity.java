package com.example.yueh.androidpractice;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TestFragmentMsgActivity extends AppCompatActivity implements SendMsgFragment.IMsgHandler {
    SendMsgFragment sendMsgFragment;
    ReceiveMsgFragment receiveMsgFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_fragment_msg);
        this.sendMsgFragment = (SendMsgFragment)getSupportFragmentManager().findFragmentById(R.id.send_msg_frg);
        this.receiveMsgFragment = (ReceiveMsgFragment)getSupportFragmentManager().findFragmentById(R.id.receive_msg_frg);
    }

    @Override
    public void onHandleMsg(String msg) {
        this.receiveMsgFragment.receiveMsg(msg);
    }
}
