package com.example.shouryakhare.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView heading = (TextView) findViewById(R.id.textView1);
        heading.setText(R.string.professionalTextHeading);

        final TextView description = (TextView) findViewById(R.id.textView2);
        description.setText(R.string.professionalText);

        final Switch toggle = (Switch) findViewById(R.id.switchBio);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    heading.setText(R.string.personalTextHeading);
                    description.setText(R.string.personalText);
                } else {
                    heading.setText(R.string.professionalTextHeading);
                    description.setText(R.string.professionalText);
                }
            }
        });
    }
}
