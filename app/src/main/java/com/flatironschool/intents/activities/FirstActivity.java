package com.flatironschool.intents.activities;

import android.content.Intent;

import com.flatironschool.intents.abstracts.FirstActivityAbs;

public class FirstActivity extends FirstActivityAbs {

    protected void onContinueButtonClick()
    {
        Intent myIntent = new Intent(this, SecondActivity.class);
        startActivity(myIntent);
    }

}
