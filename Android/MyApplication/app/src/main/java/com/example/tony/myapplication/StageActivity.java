package com.example.tony.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Tony on 2016-11-27.
 */

public class StageActivity extends Activity {

    private Button mCare;
    private Button mDuring;
    private Button mPost;
    private Button mAwareness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_page_layout);

        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        mCare = (Button)findViewById(R.id.selection_parental_care);
        mCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StageActivity.this, FaqActivity.class);
                startActivity(intent);
            }
        });
        mDuring = (Button)findViewById(R.id.selection_during_pregnecy);
        mDuring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StageActivity.this, FaqActivity.class);
                startActivity(intent);
            }
        });
        mPost = (Button)findViewById(R.id.selection_postpartum);
        mPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StageActivity.this, FaqActivity.class);
                startActivity(intent);
            }
        });
        mAwareness = (Button)findViewById(R.id.selection_awareness);
        mAwareness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StageActivity.this, FaqActivity.class);
                startActivity(intent);
            }
        });
    }
}
