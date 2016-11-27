package com.example.tony.myapplication;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Tony on 2016-11-26.
 */

public class OpenSansTextView extends TextView {
    public OpenSansTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Regular.ttf"));
    }
}
