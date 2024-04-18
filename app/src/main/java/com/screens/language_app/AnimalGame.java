package com.screens.language_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.R;

import java.util.Random;

public class AnimalGame extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal_game);
    }

    public void guess(View v) {
        Random random = new Random();
        if (random.nextBoolean()) {
            startActivity(new Intent(AnimalGame.this, AnimalGameIncorrect.class));
        }
        else {
            startActivity(new Intent(AnimalGame.this, AnimalGameCorrect.class));
        }
    }

    public void back(View v) {
        startActivity(new Intent(AnimalGame.this, MainScreen.class));
    }
}
