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

        mPageOne = (ImageView) findViewById(R.id.page1);
        mPageOne.setImageResource(R.drawable.small_circle_white);
        mPageTwo = (ImageView) findViewById(R.id.page2);
        mPageThree = (ImageView) findViewById(R.id.page3);

    }
    public void changePage(int position) {
        mPageOne.setImageResource(R.drawable.small_circle_grey);
        mPageTwo.setImageResource(R.drawable.small_circle_grey);
        mPageThree.setImageResource(R.drawable.small_circle_grey);

        switch (position){
            case 0:
                mPageOne.setImageResource(R.drawable.small_circle_white);
                break;
            case 1:
                mPageTwo.setImageResource(R.drawable.small_circle_white);
                break;
            default:
                mPageThree.setImageResource(R.drawable.small_circle_white);
                break;
        }
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
