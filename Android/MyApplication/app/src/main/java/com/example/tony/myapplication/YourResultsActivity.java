package com.example.tony.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Tony on 2016-11-27.
 */

public class YourResultsActivity extends Activity{
    public OpenSansButton mCompleteProfilePage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        setContentView(R.layout.your_result_layout);

        mCompleteProfilePage = (OpenSansButton) findViewById(R.id.your_result_complete_profile);
        mCompleteProfilePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YourResultsActivity.this, TimeLineActivity.class);
                startActivity(intent);
            }
        });

    }
}
