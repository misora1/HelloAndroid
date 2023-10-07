package com.example.helloandroid;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView helloTextView;
    private Button showHideButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        helloTextView = findViewById(R.id.textview_1);
        showHideButton = findViewById(R.id.btn);

        showHideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (helloTextView.getVisibility() == View.VISIBLE) {
                    helloTextView.setVisibility(View.INVISIBLE);
                    showHideButton.setText(R.string.show);
                } else {
                    helloTextView.setVisibility(View.VISIBLE);
                    showHideButton.setText(R.string.hide);
                }
            }
        });

    }
}