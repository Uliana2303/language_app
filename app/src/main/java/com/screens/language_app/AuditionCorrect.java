package com.screens.language_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.mobileapp.R;

public class AuditionCorrect extends ComponentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audition_correct);
    }


    public void back(View v) {
        startActivity(new Intent(AuditionCorrect.this, MainScreen.class));
    }


    public void next(View v) {
        startActivity(new Intent(AuditionCorrect.this, Audition.class));
    }
}
