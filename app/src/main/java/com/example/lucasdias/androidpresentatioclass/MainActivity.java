package com.example.lucasdias.androidpresentatioclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this, SecondActivity.class);
        Button conectActivityButton = findViewById(R.id.button);


        conectActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("OnClick","O botão foi clicado");
                Bundle bundle = new Bundle();

                bundle.putString("name", "Marianne");
                intent.putExtras(bundle);

                startActivity(intent);
                //Intent intent = new Intent(this, PullRequestActivity.class);

            }
        });

    }
}