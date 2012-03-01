package com.consumernotebook.api.examples.hellocn;

import android.os.Bundle;
import com.phonegap.*;

public class HelloCNActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}