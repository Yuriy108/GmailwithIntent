package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void click(View view) {
        Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:sef.yuriy@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT,"test");
        intent.putExtra(Intent.EXTRA_TEXT,"test");
        startActivity(intent);

    }
}