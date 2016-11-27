package com.example.tony.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by Tony on 2016-11-27.
 */

public class ProfilePagerAdapter extends FragmentPagerAdapter {
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return ProfileFragment.newFrag();
            case 1:
                return PersonalFragment.newFrag();
            case 2:
            default:
                return QuestionaireFragment.newFrag();
        }
    }

    public  ProfilePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
