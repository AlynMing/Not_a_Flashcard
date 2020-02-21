package com.example.notaflashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.Flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Flashcard_question).setVisibility(View.INVISIBLE);
                findViewById(R.id.Answer_Boi).setVisibility(View.VISIBLE);
                findViewById(R.id.right_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.wrong_answer1).setVisibility(View.INVISIBLE);
                findViewById(R.id.wrong_answer2).setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.Answer_Boi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Flashcard_question).setVisibility(View.VISIBLE);
                findViewById(R.id.Answer_Boi).setVisibility(View.INVISIBLE);
                findViewById(R.id.right_answer).setVisibility(View.VISIBLE);
                findViewById(R.id.wrong_answer1).setVisibility(View.VISIBLE);
                findViewById(R.id.wrong_answer2).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.right_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.right_answer).setBackgroundColor(getResources().getColor(R.color.colorRight));
            }
        });
        findViewById(R.id.wrong_answer1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.wrong_answer1).setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
        });
        findViewById(R.id.wrong_answer2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.wrong_answer2).setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
        });
        findViewById(R.id.eye_open).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.eye_open).setVisibility(View.INVISIBLE);
                findViewById(R.id.eye_close).setVisibility(View.VISIBLE);
                findViewById(R.id.right_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.wrong_answer1).setVisibility(View.INVISIBLE);
                findViewById(R.id.wrong_answer2).setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.eye_close).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.eye_open).setVisibility(View.VISIBLE);
                findViewById(R.id.eye_close).setVisibility(View.INVISIBLE);
                findViewById(R.id.right_answer).setVisibility(View.VISIBLE);
                findViewById(R.id.wrong_answer1).setVisibility(View.VISIBLE);
                findViewById(R.id.wrong_answer2).setVisibility(View.VISIBLE);
            }
        });
    }
}
