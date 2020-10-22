package com.lewis.cdisplay;

import android.util.Log;

import com.lewis.aninterface.Display;

public class CDisplay implements Display {
    @Override
    public void display() {
        Log.e("lwlwlw", "this is C");
    }
}
