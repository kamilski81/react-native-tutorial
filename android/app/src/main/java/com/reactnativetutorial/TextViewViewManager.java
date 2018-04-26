package com.reactnativetutorial;


import android.widget.TextView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class TextViewViewManager extends SimpleViewManager<TextView> {

    public static final String REACT_CLASS = "RCTTextView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected TextView createViewInstance(ThemedReactContext reactContext) {
        TextView tv = new TextView(reactContext);
        tv.setText("HELLO EVERYBODY, LOVE ANDROID");
        return tv;
    }



}