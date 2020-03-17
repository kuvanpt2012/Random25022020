package com.example.random25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Math
        //Lam tron
        Double a  = 1.99;
       // long a = Math.round(1.5);
        // lam tron len
        //double value1 = Math.ceil(a);
        //lam tron xuong
        double value2 = Math.floor(a);
        Log.d("BBB",String.valueOf(value2));
    }
}
