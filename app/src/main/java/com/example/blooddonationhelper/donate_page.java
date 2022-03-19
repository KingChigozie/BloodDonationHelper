package com.example.blooddonationhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class donate_page extends AppCompatActivity {

    public int question1=0,question2=0,question3=0,question4=0,question5=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_page);
    }

    public void onQuestion5Clicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.q5yes:
                if(checked)
                    question5 = 1;
                break;
            case R.id.q5no:
                if(checked)
                    question5 = 0;
                break;
            default:
                break;
        }
    }

    public void onQuestion4Clicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.q4yes:
                if(checked)
                    question4 = 1;
                break;
            case R.id.q4no:
                if(checked)
                    question4 = 0;
                break;
            default:
                break;
        }
    }

    public void onQuestion3Clicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.q3yes:
                if(checked)
                    question3 = 1;
                break;
            case R.id.q3no:
                if(checked)
                    question3 = 0;
                break;
            default:
                break;
        }
    }

    public void onQuestion2Clicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.q2yes:
                if(checked)
                    question2 = 1;
                break;
            case R.id.q2no:
                if(checked)
                    question2 = 0;
                break;
            default:
                break;
        }
    }

    public void onQuestion1Clicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.q1yes:
                if(checked)
                    question1 = 1;
                break;
            case R.id.q1no:
                if(checked)
                    question1 = 0;
                break;
            default:
                break;
        }
    }

    public void checkEligibility(View view) {
        if(question1 == 0 && question2 == 1 && question3 == 1 && question4 == 0 && question5 == 1) {
            displayToast("Eligible");
            Intent intent = new Intent(this, stepstotake_page.class);
            startActivity(intent);
        } else{
            displayToast("Ineligible");
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }

    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
}