package com.aman.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA;
    private int scoreB;

    private TextView scoreViewA;
    private TextView scoreViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewB = (TextView) findViewById(R.id.team_b_score);
    }

    /**
     * Displays the given score for Team A.
     */
    public void display(TextView textView, int score) {
        textView.setText(String.valueOf(score));
    }

    public void plusThreeA(View view) {
        scoreA += 3;
        display(scoreViewA, scoreA);
    }

    public void plusTwoA(View view) {
        scoreA += 2;
        display(scoreViewA, scoreA);
    }

    public void freeThrowA(View view) {
        scoreA++;
        display(scoreViewA, scoreA);
    }

    public void plusThreeB(View view) {
        scoreB += 3;
        display(scoreViewB, scoreB);
    }

    public void plusTwoB(View view) {
        scoreB += 2;
        display(scoreViewB, scoreB);
    }

    public void freeThrowB(View view) {
        scoreB++;
        display(scoreViewB, scoreB);
    }

    public void reset(View view) {
        scoreA = scoreB = 0;
        display(scoreViewA, scoreA);
        display(scoreViewB, scoreB);
    }
}
