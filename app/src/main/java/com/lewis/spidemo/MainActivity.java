package com.lewis.spidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import android.widget.Button;

import com.lewis.aninterface.Display;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Log.e("lwlwlw", "click");
            loadModule();
        });

    }

    private void loadModule() {
        ServiceLoader<Display> loader = ServiceLoader.load(Display.class);
        for (Display display : loader) {
            display.display();
        }
    }
}