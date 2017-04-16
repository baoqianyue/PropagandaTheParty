package com.example.sijinsixin.ui.activity;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sijinsixin.R;

public class GradeActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        mTextView = (TextView) findViewById(R.id.tv_grade);
        SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
        int grade = sp.getInt("grade", 0);
        mTextView.setText("测试结束，你一共作对了" + grade + "题！");
    }
}
