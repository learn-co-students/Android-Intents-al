package com.flatironschool.intents.activities;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;

import com.flatironschool.intents.R;


public class ThirdActivity extends Activity {

    public static String EXTRA_ANYTHING_TEXT = "extra_anything_text";
    public static String EXTRA_COLOR = "extra_color";

    private ViewGroup mParentView;
    private TextView mAnythingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        getViews();
        prepareViews();
    }

    private void getViews()
    {
        mParentView = (ViewGroup) findViewById(R.id.parent_view);
        mAnythingTextView = (TextView) findViewById(R.id.anything_text_view);
    }

    private void prepareViews()
    {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // Pulling out extras
            String anythingText = extras.getString(EXTRA_ANYTHING_TEXT);
            String color = "#" + extras.getString(EXTRA_COLOR);

            // Applying views
            mAnythingTextView.setText(anythingText);
            mParentView.setBackgroundColor(Color.parseColor(color));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.third, menu);
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
