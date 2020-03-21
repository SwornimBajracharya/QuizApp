package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.CheckBox;

public class QuizActivity extends AppCompatActivity {

    private Button submitBtn;
    private int score;

    private RadioGroup FirstQuestion;
    private RadioGroup SecondQuestion;
    private RadioGroup FifthQuestion;

    private EditText editText;
    private CheckBox blue;
    private CheckBox paint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        submitBtn = findViewById(R.id.submitBtn);
        editText = findViewById(R.id.edit_text);

        blue = findViewById(R.id.blue);
        paint = findViewById(R.id.paint);

        FirstQuestion = findViewById(R.id.num_one_radio_group);
        SecondQuestion = findViewById(R.id.num_two_radio_group);
        FifthQuestion = findViewById(R.id.num_five_radio_group);

        FirstQuestion.clearCheck();
        FirstQuestion.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checkedId) {
            }
        });


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                score = 0;

                if(FirstQuestion.getCheckedRadioButtonId() == R.id.ans1st){
                    score += 1;
                }

                if(SecondQuestion.getCheckedRadioButtonId() == R.id.ans2nd){
                    score += 1;
                }

                String answer = editText.getText().toString();
                if(answer.equalsIgnoreCase("really big")) {
                    score += 1;
                }

                if(blue.isChecked() && paint.isChecked()){
                    score += 1;
                }

                if(FifthQuestion.getCheckedRadioButtonId() == R.id.ans5th){
                    score += 1;
                }

                Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);
                intent.putExtra("SCORE", score+"/5");
                startActivity(intent);
                }
            }
        );




    }
}
