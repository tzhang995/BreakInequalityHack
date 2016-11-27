package com.example.tony.myapplication;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import static android.R.attr.name;

/**
 * Created by Tony on 2016-11-26.
 */

public class ProfileFragment extends Fragment {
    public ImageView backButton;
    public OpenSansButton nextButton;
    public EditText mName;
    public EditText mHNum;
    public EditText mAddr;
    public EditText mEmail;
    public EditText mMobileNum;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference("USERS");
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
        mName = (EditText) rootView.findViewById(R.id.profile_name);
        mHNum = (EditText) rootView.findViewById(R.id.profile_health_number);
        mAddr = (EditText) rootView.findViewById(R.id.profile_address);
        mEmail = (EditText) rootView.findViewById(R.id.profile_email);
        mMobileNum = (EditText) rootView.findViewById(R.id.profile_phone_number);
        return rootView;
    }

    public static ProfileFragment newFrag() {
        return new ProfileFragment();
    }

    private void writeData() {
        DatabaseReference usersRef = ref.child("TEST_USER");
        usersRef.child(mName.getEditableText().toString()).setValue(mName.getEditableText().toString());
        usersRef.child("Home number ").setValue(mHNum.getEditableText().toString());
        usersRef.child("Address ").setValue(mAddr.getEditableText().toString());
        usersRef.child("Email ").setValue(mEmail.getEditableText().toString());
        usersRef.child("Mobile number ").setValue(mMobileNum.getEditableText().toString());
    }
}
