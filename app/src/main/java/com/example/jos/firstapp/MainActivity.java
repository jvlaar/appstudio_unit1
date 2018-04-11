package com.example.jos.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        Log.d("Potatoe", "checkClicked");

        CheckBox checkBox = (CheckBox) v;
        String checkBoxName = checkBox.getText().toString();

        ImageView image = (ImageView) findViewById(R.id.imageViewEyes);

        ImageView image (ImageView) R.

        if (checkBox.isChecked()) {
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.INVISIBLE);
        }
    }
}
