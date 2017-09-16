package com.example.shouryakhare.aboutme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button aboutMeButton = (Button) findViewById(R.id.aboutMe_button);
        aboutMeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent aboutIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(aboutIntent);
            }
        });
    }
}
