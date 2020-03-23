package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startQuizButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startQuizButton = findViewById(R.id.startQuiz);

        startQuizButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = QuizActivity.makeIntent(MainActivity.this);
                startActivity(intent);
            }
        });
    }
}
