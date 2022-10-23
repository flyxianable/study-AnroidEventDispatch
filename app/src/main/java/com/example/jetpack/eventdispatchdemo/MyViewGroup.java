package com.example.jetpack.eventdispatchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class MyViewGroup extends LinearLayout {

    public static final String TAG = "MyViewGroup";

    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
//        boolean is = super.dispatchTouchEvent(ev);
        Log.v("lyb", TAG + " dispatchTouchEvent return = " );
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        boolean is = super.onTouchEvent(event);
        Log.v("lyb", TAG + " onTouchEvent: return = " );
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        boolean is = super.onInterceptTouchEvent(ev);
        Log.v("lyb", TAG + " onInterceptTouchEvent: return = ");
        return super.onInterceptTouchEvent(ev);
    }
}
