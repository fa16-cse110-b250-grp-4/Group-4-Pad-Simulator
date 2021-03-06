package com.kesden.b250.groupfour.group4padsim;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    private final int gameResult = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void newGame(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, gameResult);
    }

    public void highScores(View view){
        Intent intent = new Intent(this, HighScoreActivity.class);
        startActivity(intent);

    }

    public void settings(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == gameResult) {
            // Update high scores here
        }
    }
}
