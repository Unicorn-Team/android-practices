package com.example.yueh.androidpractice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class TestService extends Service {
    private IBinder mBinder = new CounterBinder();
    public TestService() {
    }

    @Override
    public void onCreate() {
        // 服务创建时调用
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // 服务启动时调用
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // 与其他组件通信,必须实现，可返回null
        return mBinder;
    }

    @Override
    public void onDestroy() {
        // 服务销毁时调用
        super.onDestroy();
    }

    class CounterBinder extends Binder {

        public void startCount() {

        }
        public void getNumber() {

        }
    }
}
