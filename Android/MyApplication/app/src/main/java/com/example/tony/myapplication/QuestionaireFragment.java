package com.example.tony.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tony on 2016-11-26.
 */

public class QuestionaireFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.questionnaire_page_layout, container, false);
        return rootView;
    }

    public static QuestionaireFragment newFrag() {
        return new QuestionaireFragment();
    }
}