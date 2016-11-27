package com.example.tony.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Tony on 2016-11-27.
 */

public class YourResultsActivity extends Activity{
    public OpenSansButton mCompleteProfilePage;
    private ImageView backButton;

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
        backButton = (ImageView) findViewById(R.id.personal_page_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
