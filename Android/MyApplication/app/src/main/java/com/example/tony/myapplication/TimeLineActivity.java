package com.example.tony.myapplication;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Tony on 2016-11-27.
 */

public class TimeLineActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        setContentView(R.layout.your_profile_layout);
    }

}
