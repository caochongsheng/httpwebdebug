package com.example.administrator.mywebdebug;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import cn.darkal.networkdiagnosis.Activity.HttpCaptureMainActivity;

public class MainActivity extends AppCompatActivity {

    private Context context;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        text = (TextView) findViewById(R.id.text);

                Intent intent = new Intent(context,HttpCaptureMainActivity.class);
                startActivity(intent);


    }
}
