package com.screens.language_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.R;

public class WordGame extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_game);
    }


    public void back(View v) {
        startActivity(new Intent(WordGame.this, MainScreen.class));
    }


    public void choose(View v) {
        startActivity(new Intent(WordGame.this, WordGame.class));
    }
}
