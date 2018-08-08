package com.bwei.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/5/21 17:04
 */

public class TouchGroup extends RelativeLayout {
    public TouchGroup(Context context) {
        super(context);
    }

    public TouchGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    //分发事件
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i("xxx", TouchUtils.getTouchName("dispatchTouchEvent:" + TouchGroup.class.getSimpleName(), event));
        return super.dispatchTouchEvent(event);
    }

    //拦截事件
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.i("xxx", TouchUtils.getTouchName("onInterceptTouchEvent:" + TouchGroup.class.getSimpleName(), event));

        return super.onInterceptTouchEvent(event);
    }


    //消费事件
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("xxx", TouchUtils.getTouchName("onTouchEvent:" + TouchGroup.class.getSimpleName(), event));

        return super.onTouchEvent(event);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
