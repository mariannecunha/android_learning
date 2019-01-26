package com.example.lucasdias.androidpresentatioclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intentObject = getIntent();
        Bundle bundle = intentObject.getExtras();
        String name = bundle.getString("name");

        Log.i("getKey","bundle is working: "+name);
        TextView warning = findViewById(R.id.secondActivity_tvWarning);
        warning.setText(name + " Mo de vida, te amo muito");




//        Intent intentObject = getIntent();
//        Bundle bundle = intentObject.getExtras();
        //id = bundle.getString("id");
    }
}
