package com.screens.language_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.R;

public class AnimalGameIncorrect extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal_incorrect);
        getWindow().setStatusBarColor(getResources().getColor(R.color.usable_red));
    }


    public void back(View v) {
        startActivity(new Intent(AnimalGameIncorrect.this, MainScreen.class));
    }


    public void next(View v) {
        startActivity(new Intent(AnimalGameIncorrect.this, AnimalGame.class));
    }


    public void try_again(View v) {
        startActivity(new Intent(AnimalGameIncorrect.this, AnimalGame.class));
    }
}
