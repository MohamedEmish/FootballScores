package com.example.amosh.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int aGoal = 0;
    int bGoal = 0;
    int aFoul = 0;
    int bFoul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View view) {
        aGoal = 0;
        bGoal = 0;
        aFoul = 0;
        bFoul = 0;
        displayA(aGoal);
        displayB(bGoal);
        displayC(aFoul);
        displayD(bFoul);
    }

    public void goalA(View view) {
        aGoal = aGoal + 1;
        displayA(aGoal);
    }

    public void aFoul(View view) {
        aFoul = aFoul + 1;
        displayC(aFoul);
    }

    public void bGoal(View view) {
        bGoal = bGoal + 1;
        displayB(bGoal);
    }

    public void bFoul(View view) {
        bFoul = bFoul + 1;
        displayD(bFoul);

    }


    private void displayA(int aGoal) {
        TextView teamATextView = findViewById(R.id.goalA);
        teamATextView.setText(String.valueOf(aGoal));
    }

    private void displayB(int bGoal) {
        TextView teamBTextView = findViewById(R.id.goalB);
        teamBTextView.setText(String.valueOf(bGoal));
    }

    private void displayC(int aFoul) {
        TextView teamATextView = findViewById(R.id.FoulA);
        teamATextView.setText(String.valueOf(aFoul));
    }

    private void displayD(int bGoal) {
        TextView teamBTextView = findViewById(R.id.FoulB);
        teamBTextView.setText(String.valueOf(bFoul));
    }

}
