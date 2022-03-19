package com.example.blooddonationhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void donatePage(View view) {
        Intent intent = new Intent(this, donate_page.class);
        startActivity(intent);
    }

    public void stepstotakePage(View view) {
        Intent intent = new Intent(this, stepstotake_page.class);
        startActivity(intent);
    }
}