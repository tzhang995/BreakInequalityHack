package com.example.tony.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private Button newUserButton;

    private Button signUpButton;

    private EditText mMobileEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_page_layout);
        newUserButton = (Button) findViewById(R.id.new_user_button);
        newUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                view.getContext().startActivity(intent);
            }
        });
        signUpButton = (Button) findViewById(R.id.front_page_signup);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StageActivity.class);
                startActivity(intent);
            }
        });
        mMobileEditText = (EditText) findViewById(R.id.login_mobile_phone_number);
        mMobileEditText.setImeOptions(EditorInfo.IME_ACTION_DONE);
    }

    private void hide_keyboard(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager)
                context.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInput(0, 0);
    }

}
