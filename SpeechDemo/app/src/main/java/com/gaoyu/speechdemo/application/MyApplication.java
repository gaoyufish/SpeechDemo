package com.gaoyu.speechdemo.application;

import android.app.Application;

import com.gaoyu.speechdemo.R;
import com.iflytek.cloud.SpeechUtility;

import static com.gaoyu.speechdemo.R.*;

/**
 * Created by gaoyu on 2017/8/4.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        // 注意： appid 必须和下载的SDK保持一致，否则会出现10407错误
        //讯飞语音
        SpeechUtility.createUtility(MyApplication.this, "appid=" + getString(string.app_speech_id));
        super.onCreate();

    }
}
