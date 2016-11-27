package com.example.tony.myapplication;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Tony on 2016-11-26.
 */

public class ProfileFragment extends Fragment {
    public ImageView backButton;
    public OpenSansButton nextButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.contact_page_layout, container, false);

        backButton = (ImageView) rootView.findViewById(R.id.contact_page_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });

        nextButton = (OpenSansButton) rootView.findViewById(R.id.contact_page_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProfileActivity myAc = (ProfileActivity) getActivity();
                myAc.setNext(0);
            }
        });

        return rootView;
    }

    public static ProfileFragment newFrag() {
        return new ProfileFragment();
    }
}
