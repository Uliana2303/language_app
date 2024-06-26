package com.screens.language_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.R;

public class AnimalGameCorrect extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal_correct);
        getWindow().setStatusBarColor(getResources().getColor(R.color.usable_green));
    }


    public void back(View v) {
        startActivity(new Intent(AnimalGameCorrect.this, MainScreen.class));
    }


    public void next(View v) {
        startActivity(new Intent(AnimalGameCorrect.this, AnimalGame.class));
    }

}
