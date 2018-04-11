package com.example.jos.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names = Arrays.asList("Body", "Arms", "Ears", "Eyebrows", "Glasses", "Eyes",
                "Hat", "Mouth", "Moustache", "Nose", "Shoes");
        //TODO: Iterate over names and restore saved state
    }

    public void checkClicked(View v) {
        Log.d("Potatoe", "checkClicked");

        CheckBox checkBox = (CheckBox) v;
        String checkBoxName = checkBox.getText().toString();

        ImageView image = (ImageView) findViewById(MainActivity.this.getResources()
                .getIdentifier("imageView" + checkBoxName, "id", getBaseContext().getPackageName()));

        if (checkBox.isChecked()) {
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.INVISIBLE);
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //TODO: Iterate over names and save state
    }
}
