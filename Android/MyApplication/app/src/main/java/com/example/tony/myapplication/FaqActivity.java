package com.example.tony.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Tony on 2016-11-27.
 */

public class FaqActivity extends Activity {
    private Button button;
    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        setContentView(R.layout.faq_page_layout);
        button = (Button) findViewById(R.id.faq_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FaqActivity.this, ProfileActivity.class);
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
