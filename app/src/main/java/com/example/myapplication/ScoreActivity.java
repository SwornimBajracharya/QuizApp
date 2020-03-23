package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private TextView textView;
    public static Intent makeIntent(Context context, String scoreExtra){
        Intent intent = new Intent(context, ScoreActivity.class);
        intent.putExtra("Score", scoreExtra);
        return intent;
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String score = intent.getStringExtra("SCORE");
        textView.setText(score);
    }
}
