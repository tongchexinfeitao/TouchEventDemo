package com.bwei.touchevent;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //   startActivity(new Intent(this,Main2Activity.class));

    }

    //分发事件
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i("xxx", TouchUtils.getTouchName("dispatchTouchEvent:" + MainActivity.class.getSimpleName(), event));
        return super.dispatchTouchEvent(event);
    }

    //消费事件
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("xxx", TouchUtils.getTouchName("onTouchEvent:" + MainActivity.class.getSimpleName(), event));
        return super.onTouchEvent(event);
    }

}
