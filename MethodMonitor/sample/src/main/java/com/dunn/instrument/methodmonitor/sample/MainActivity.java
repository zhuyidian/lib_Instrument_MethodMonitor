package com.dunn.instrument.methodmonitor.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.dunn.instrument.methodmonitor.choreographer.ChoreographerMonitor;
import com.dunn.instrument.methodmonitor.slowmethod.SlowMethodMonitor;

import java.io.File;
import java.io.FileInputStream;

public class MainActivity extends Activity {
    public static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        Log.i(TAG,"click:");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public static void methodInit(){
        SlowMethodMonitor slowMethodMonitor = new SlowMethodMonitor();
        slowMethodMonitor.start();
    }

    public static void choreographerInit(){
        ChoreographerMonitor choreographerMonitor = new ChoreographerMonitor();
        choreographerMonitor.start();
    }
}
