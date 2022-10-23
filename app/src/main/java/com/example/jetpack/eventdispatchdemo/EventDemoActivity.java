package com.example.jetpack.eventdispatchdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

public class EventDemoActivity extends AppCompatActivity {

    public static final String TAG = "EventDemoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_demo);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        boolean is = super.onTouchEvent(event);
        Log.v("lyb", TAG + " onTouchEvent: return =  ");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
//        boolean is = super.dispatchTouchEvent(ev);
        Log.v("lyb", TAG + " dispatchTouchEvent: return = ");
        return super.dispatchTouchEvent(ev);
    }


}