package com.belen1216.android.util.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.belen1216.android.util.NetWorkUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String typeName = NetWorkUtils.getNetworkTypeName(this);
        Log.d("TAG", typeName);
    }
}
