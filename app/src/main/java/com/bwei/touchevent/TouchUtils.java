package com.bwei.touchevent;

import android.view.MotionEvent;

/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/5/21 17:09
 */

public class TouchUtils {
    public static String getTouchName(String simpleName, MotionEvent event) {
        String activonName = simpleName + "------------------------------------>";
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN://按下
                activonName += "action_down";
                break;
            case MotionEvent.ACTION_MOVE://移动
                activonName += "action_move";

                break;
            case MotionEvent.ACTION_UP://弹起
                activonName += "action_up";

                break;
        }

        return activonName;
    }
}
