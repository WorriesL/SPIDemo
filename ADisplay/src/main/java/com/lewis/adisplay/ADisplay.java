package com.lewis.adisplay;

import android.util.Log;

import com.lewis.aninterface.Display;

public class ADisplay implements Display {
    @Override
    public void display() {
        Log.e("lwlwlw", "This is A");
    }
}
