package com.example.zeonit.myapplication2;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LocaleHelper.setLocale(MainActivity.this,"en");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        sdsdsd
    }
}
