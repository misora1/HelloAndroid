package com.example.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;


import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {

    private int count = 0;
    private TextView counterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        counterTextView = findViewById(R.id.counter_textview);
        updateCounter();

        Button increaseButton = findViewById(R.id.increase_button);
        increaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                updateCounter();
            }
        });

        Button decreaseButton = findViewById(R.id.decrease_button);
        decreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                updateCounter();
            }
        });

        Button resetButton = findViewById(R.id.reset_button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                updateCounter();
            }
        });
    }

    private void updateCounter() {
        String counterText = "The current number is: " + count;
        SpannableString spannableString = new SpannableString(counterText);

        // Set color for the number part
        ForegroundColorSpan redColorSpan = new ForegroundColorSpan(Color.RED);
        spannableString.setSpan(redColorSpan, 23, counterText.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        counterTextView.setText(spannableString);
    }

}
