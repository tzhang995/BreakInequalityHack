package com.example.tony.myapplication;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

/**
 * Created by Tony on 2016-11-26.
 */

public class ProfileActivity extends FragmentActivity {
    private static final int NUMPAGES = 5;

    private ViewPager mPager;

    private PagerAdapter mPagerAdapter;

    private ImageView mPageOne;
    private ImageView mPageTwo;
    private ImageView mPageThree;

    private EditText mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager_new_user);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        mPager = (ViewPager) findViewById(R.id.new_user_pager);
        mPagerAdapter = new ProfilePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.setCurrentItem(0);
        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(mPager.getWindowToken(), 0);
                changePage(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }
    public void changePage(int position) {
    }

    public void setPage(int page){
        if(page >=0 && page < mPagerAdapter.getCount()) {
            mPager.setCurrentItem(page);
        }
    }

    public void setBack(int page){
        setPage(page-1);
    }

    public void setNext(int page){
        setPage(page+1);
    }
}
