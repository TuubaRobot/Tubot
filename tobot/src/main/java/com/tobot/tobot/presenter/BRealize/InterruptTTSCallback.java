package com.tobot.tobot.presenter.BRealize;

import android.util.Log;

import com.tobot.tobot.MainActivity;

/**
 * Created by YF-04 on 2017/12/21.
 */

/**
 * 打断 TTS 回调
 */
public class InterruptTTSCallback extends BaseTTSCallback {
    private static final String TAG = "InterruptTTSCallback";

    private MainActivity mainActivity;
    private BaseTTSCallback mBaseTTSCallback;

    public InterruptTTSCallback(MainActivity activity,BaseTTSCallback baseTTSCallback){
        this.mainActivity=activity;
        this.mBaseTTSCallback=baseTTSCallback;

    }


    @Override
    public void onStart(String s) {
        Log.i(TAG ,"开始语音播报TTS:"+s);

        BFrame.ittsCallback.onStart(s);

        if (mBaseTTSCallback!=null){
            mBaseTTSCallback.onStart(s);
        }

    }

    @Override
    public void onPaused() {

        BFrame.ittsCallback.onPaused();

        if (mBaseTTSCallback!=null){
            mBaseTTSCallback.onPaused();
        }

    }

    @Override
    public void onResumed() {

        BFrame.ittsCallback.onResumed();

        if (mBaseTTSCallback!=null){
            mBaseTTSCallback.onResumed();
        }

    }

    @Override
    public void onCompleted() {

        BFrame.ittsCallback.onCompleted();

        if (mBaseTTSCallback!=null){
            mBaseTTSCallback.onCompleted();
        }
    }

    @Override
    public void onError(String s) {
        Log.i(TAG ,"TTS错误"+s);

        BFrame.ittsCallback.onError(s);

        if (mBaseTTSCallback!=null){
            mBaseTTSCallback.onError(s);
        }
    }
}
