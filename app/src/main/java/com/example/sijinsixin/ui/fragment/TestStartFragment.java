package com.example.sijinsixin.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.sijinsixin.App;
import com.example.sijinsixin.R;
import com.example.sijinsixin.bean.BeanLab;
import com.example.sijinsixin.ui.activity.TestpagerActivity;

/**
 * Created by 鲍骞月 on 2017/4/15.
 */

public class TestStartFragment extends Fragment {

    private TextView mTextView;
    private Button mButton;

    public static Fragment newInstance() {
        return new TestStartFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable
            ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_test_start, container, false);
        mTextView = (TextView) v.findViewById(R.id.tv_test_introduction);
        mButton = (Button) v.findViewById(R.id.btn_test_go);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = TestpagerActivity.newIntent(getContext(),
                        BeanLab.get(App.getContext()).getBeans().get(0).getId());
                startActivity(intent);
            }
        });

        /**
         * 使用SharedPreferences存储分数
         */
        SharedPreferences.Editor editor = getContext().getSharedPreferences("data",
                Context.MODE_PRIVATE).edit();
        editor.putInt("grade", 0);
        editor.apply();
        return v;
    }
}
