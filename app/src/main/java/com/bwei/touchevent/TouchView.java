package com.bwei.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/5/21 17:03
 */

public class TouchView extends View {
    public TouchView(Context context) {
        super(context);
    }

    public TouchView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //分发事件
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

        Log.i("xxx", TouchUtils.getTouchName("dispatchTouchEvent:" + TouchView.class.getSimpleName(), event));
        return super.dispatchTouchEvent(event);
    }


    //消费事件
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("xxx", TouchUtils.getTouchName("onTouchEvent:" + TouchView.class.getSimpleName(), event));
        return true;
    }
}
