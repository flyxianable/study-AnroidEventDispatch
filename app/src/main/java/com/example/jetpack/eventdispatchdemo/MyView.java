package com.example.jetpack.eventdispatchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class MyView extends View {

    public static final String TAG = "MyView";

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
//        boolean is = super.dispatchTouchEvent(event);
        Log.v("lyb", TAG + " dispatchTouchEvent: return = " );
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        boolean is = super.onTouchEvent(event);
        Log.v("lyb", TAG + " onTouchEvent: return = " );
        return super.onTouchEvent(event);
    }


}
