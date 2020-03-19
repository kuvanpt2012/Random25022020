package com.example.random25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText mEdtSomin,mEdtSomax;
    Button mBtnRandom;
    TextView mTvKetqua;
    int mSmin,mSmax;
    String mTextmin,mTextmax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdtSomax = findViewById(R.id.editsomax);
        mEdtSomin = findViewById(R.id.editsomin);
        mBtnRandom = findViewById(R.id.random);
        mTvKetqua = findViewById(R.id.tvketqua);

        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 mTextmin = mEdtSomin.getText().toString();
                 mTextmax = mEdtSomax.getText().toString();
                Log.d("BBB"," Text Min : " + mTextmin);
                Log.d("BBB"," Text Max : " + mTextmax);

                if (mTextmin.equals("")|| mTextmax.equals("")){
                    Toast.makeText(MainActivity.this,"bạn nhập thiếu thông tin",Toast.LENGTH_SHORT).show();
                    return;
                }
                 mSmin = Integer.parseInt(mTextmin);
                 mSmin = Integer.parseInt(mTextmax);
                // viết điều kiện  theo toán tử 3 ngôi
                mSmax = mSmin > mSmax ? mSmin + 1 : mSmax;
                //điều kiện if else
                // if (smin > smax){
                 //   smax = smin + 1;
//                  }

            }

        });

  }
}
