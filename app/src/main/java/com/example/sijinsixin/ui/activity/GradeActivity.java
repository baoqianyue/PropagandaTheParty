package com.example.sijinsixin.ui.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sijinsixin.App;
import com.example.sijinsixin.R;

public class GradeActivity extends AppCompatActivity {

    private TextView tvTrueCount;
    private TextView tvFalseCount;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
        int grade = sp.getInt("grade", 0);
        int falsegrade = 30 - grade;
        tvTrueCount = (TextView) findViewById(R.id.truecount);
        tvFalseCount = (TextView) findViewById(R.id.falsecount);
        tvTrueCount.setText(grade+"");
        tvFalseCount.setText(falsegrade + "");
        mButton = (Button) findViewById(R.id.btn_back_up);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(App.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
