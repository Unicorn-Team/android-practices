package com.example.yueh.androidpractice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ReceiveMsgFragment extends Fragment {
    TextView msgTxtView;

    public ReceiveMsgFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_receive_msg, container, false);
        msgTxtView = rootView.findViewById(R.id.receive_msg_text);
        return rootView;
    }

    public void receiveMsg(String msg){
        msgTxtView.setText(msg);
    }
}
