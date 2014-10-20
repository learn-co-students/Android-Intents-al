package com.flatironschool.intents.activities;

import android.content.Intent;

import com.flatironschool.intents.abstracts.SecondActivityAbs;

public class SecondActivity extends SecondActivityAbs {

    protected void continueOnClick(String anythingInput, String colorInput)
    {
        Intent myIntent = new Intent(this, ThirdActivity.class);
        myIntent.putExtra(ThirdActivity.EXTRA_ANYTHING_TEXT, anythingInput);
        myIntent.putExtra(ThirdActivity.EXTRA_COLOR, colorInput);
        startActivity(myIntent);
    }

}
