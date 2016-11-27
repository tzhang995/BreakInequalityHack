package com.example.tony.myapplication;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Time;
import java.util.ArrayList;

/**
 * Created by Tony on 2016-11-26.
 */

public class QuestionaireFragment extends Fragment {
    public ImageView backButton;
    public OpenSansButton doneButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.medical_page_layout, container, false);
        backButton = (ImageView) rootView.findViewById(R.id.medical_page_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProfileActivity myAc = (ProfileActivity) getActivity();
                myAc.setBack(2);
            }
        });
        doneButton = (OpenSansButton) rootView.findViewById(R.id.medical_page_done);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), YourResultsActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

    public static QuestionaireFragment newFrag() {
        return new QuestionaireFragment();
    }


}