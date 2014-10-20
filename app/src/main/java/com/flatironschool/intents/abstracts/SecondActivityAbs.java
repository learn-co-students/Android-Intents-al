package com.flatironschool.intents.abstracts;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.flatironschool.intents.R;

public abstract class SecondActivityAbs extends Activity {

    private EditText mAnythingEditText, mColorEditText;
    private Button mContinueButton;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mContext = getApplicationContext();
        getViews();
        prepareViews();
    }

    private void getViews() {
        mAnythingEditText = (EditText) findViewById(R.id.anything_text_box);
        mColorEditText = (EditText) findViewById(R.id.color_text_box);
        mContinueButton = (Button) findViewById(R.id.continue_button);
    }

    private void prepareViews() {
        mContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String anythingInput = mAnythingEditText.getText().toString();
                String colorInput = mColorEditText.getText().toString();

                // Checking for invalid input
                if(anythingInput.matches("") || !colorIsValid(colorInput))
                {
                    // Displaying error for empty anything field
                    if(anythingInput.matches(""))
                    {
                        Toast.makeText(mContext, R.string.enter_anything_error, Toast.LENGTH_LONG).show();
                    }

                    // Displaying error for invalid hex
                    if(!colorIsValid(colorInput))
                    {
                        Toast.makeText(mContext, R.string.enter_color_error, Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    continueOnClick(anythingInput, colorInput);
                }
            }
        });
    }

    /**
     * Implement
     */
    protected abstract void continueOnClick(String anythingInput, String colorInput);

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private boolean colorIsValid(String color)
    {
        try {
            Long.parseLong(color, 16);
            return color.length() == 6;
        }
        catch (NumberFormatException ex) {
            return false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
