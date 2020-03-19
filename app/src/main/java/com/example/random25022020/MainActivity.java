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

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText mEdtSomin,mEdtSomax;
    Button mBtnRandom;
    TextView mTvKetqua;
    int mSmin,mSmax,mValue;
    String mTextmin,mTextmax;
    Random mRandom;
    String mTvValue = ""; //cấp phát chuỗi rỗng k đc để null

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdtSomax = findViewById(R.id.editsomax);
        mEdtSomin = findViewById(R.id.editsomin);
        mBtnRandom = findViewById(R.id.random);
        mTvKetqua = findViewById(R.id.tvketqua);
        // khai báo mảng
        ArrayList <Integer> arrayNumber = new ArrayList<>();

        // thêm dữ liệu
        arrayNumber.add(10);// index = 0
        arrayNumber.add(9);//index = 1
        arrayNumber.add(8); // index = 2
        // lấy kích thước
        //Log.d("BBB",String.valueOf(arrayNumber.size()));
        // lấy giá trị phần tử theo vị trí.
        //Log.d("BBB",String.valueOf(arrayNumber.get(0)));

        // xóa
       // arrayNumber.remove(0);
        //Log.d("BBB",String.valueOf(arrayNumber.get(0)));

        //sửa
        arrayNumber.set(0,3);
        Log.d("BBB",String.valueOf(arrayNumber.get(0)));



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
                 mSmax = Integer.parseInt(mTextmax);
                //điều kiện if else
                // if (smin > smax){
                //   smax = smin + 1;
//                  }

                // viết điều kiện  theo toán tử 3 ngôi
                mSmax = mSmin > mSmax ? mSmin + 1 : mSmax;
                mEdtSomax.setText(String.valueOf(mSmax));
                mRandom = new Random();
                mValue = mRandom.nextInt(mSmax - mSmin + 1 ) + mSmin;
                mTvValue += mValue + " - ";
                mTvKetqua.setText(mTvValue);

            }

        });

  }
}
