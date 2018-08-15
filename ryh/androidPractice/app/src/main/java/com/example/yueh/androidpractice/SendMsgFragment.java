package com.example.yueh.androidpractice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SendMsgFragment extends Fragment implements View.OnClickListener {

    EditText editText;
    Button sendBtn;

    public SendMsgFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_send_msg, container, false);
        sendBtn = rootView.findViewById(R.id.send_msg_btn);
        sendBtn.setOnClickListener(this);
        editText = rootView.findViewById(R.id.msg_edit);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        IMsgHandler msgHandler = (IMsgHandler)getActivity();
        msgHandler.onHandleMsg(editText.getText().toString());
    }

    interface IMsgHandler {
        void onHandleMsg(String msg);
    }
}
