package com.example.blooddonationhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class stepstotake_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stepstotake_page);
    }

    public void donationRegiserPage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}