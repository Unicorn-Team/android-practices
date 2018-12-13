package com.example.yueh.androidpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TestOkHttpActivity extends AppCompatActivity implements Callback {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_ok_http);
        findViewById(R.id.get_request_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getRequest();
            }
        });
        findViewById(R.id.post_request_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postRequest();
            }
        });
    }

    private void getRequest() {
        OkHttpClient client = new OkHttpClient();
        final Request request = new Request.Builder().get().url("http://v3.wufazhuce.com:8000/api/onelist/idlist/?channel=wdj&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android").build();
        Call call = client.newCall(request);
        call.enqueue(this);
    }

    private void postRequest() {
        MediaType mediaType = MediaType.parse("text/x-markdown; charset=utf-8"); // 描述请求/响应 body 的内容类型
        String requestBody = "I am Jdqm.";
        Request request = new Request.Builder()
                .url("https://api.github.com/markdown/raw")
                .post(RequestBody.create(mediaType, requestBody))
                .build();
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.newCall(request).enqueue(this);
    }

    private void toast(String str) {
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(Call call, IOException e) {

    }

    @Override
    public void onResponse(Call call, final Response response) throws IOException {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    Headers headers = response.headers();
                    for (int i = 0; i < headers.size(); i++) {
                        Log.d("ResponseHeader", headers.name(i) + ":" + headers.value(i));
                    }
                    String bodyStr = response.body().string();
                    Log.d("ResponseBody", bodyStr);
                    toast(bodyStr);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
