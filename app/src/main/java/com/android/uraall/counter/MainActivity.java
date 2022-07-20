package com.android.uraall.counter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    MainActivityViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        model = new ViewModelProvider(this).get(MainActivityViewModel.class);

        textView.setText(String.valueOf(model.getCurrentValue()));
    }

    public void decreaseValue(View view) {
        textView.setText(String.valueOf(model.getDecreasedValue()));
    }

    public void increaseValue(View view) {
        textView.setText(String.valueOf(model.getIncreasedValue()));
    }
}
