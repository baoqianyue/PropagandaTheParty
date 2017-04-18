package com.example.sijinsixin.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sijinsixin.App;
import com.example.sijinsixin.R;
import com.example.sijinsixin.bean.Bean;
import com.example.sijinsixin.bean.BeanLab;
import com.example.sijinsixin.ui.activity.GradeActivity;

import java.util.UUID;

/**
 * Created by 鲍骞月 on 2017/4/15.
 */

public class TestFragment extends Fragment {
    private static final String BEAN_ID = "bean_id";
    private static final String TAG = "TestFragment";
    private Bean mBean;
    private TextView tvTitle;
    private RadioGroup mRadioGroup;
    private RadioButton rbA;
    private RadioButton rbB;
    private RadioButton rbC;
    private RadioButton rbD;
    private int grade = 0;
    private int num = 0;
    private String A;
    private String B;
    private String C;
    private String D;
    private Bean currentBean;


    public static TestFragment newInstance(UUID beanId) {
        Bundle args = new Bundle();
        args.putSerializable(BEAN_ID, beanId);

        TestFragment fragment = new TestFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UUID beanId = (UUID) getArguments().getSerializable(BEAN_ID);
//        Log.i(TAG, beanId.toString());
        mBean = BeanLab.get(App.getContext()).getBean(beanId);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable
            ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_test, container, false);

        tvTitle = (TextView) v.findViewById(R.id.tv_test_title);
        tvTitle.setText(mBean.getTitle());
        mRadioGroup = (RadioGroup) v.findViewById(R.id.rg_test_item);
        rbA = (RadioButton) v.findViewById(R.id.rb_test_a);
        rbB = (RadioButton) v.findViewById(R.id.rb_test_b);
        rbC = (RadioButton) v.findViewById(R.id.rb_test_c);
        rbD = (RadioButton) v.findViewById(R.id.rb_test_d);
        Toolbar toolbar = (Toolbar) v.findViewById(R.id.toolbar);
        //此处必须有AppCompatActivity的强转才可以设置
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        //设置Fragment中的onCreateOptionMenu被调用
        toolbar.inflateMenu(R.menu.toolbar);
        setHasOptionsMenu(true);
        D = mBean.getD();
        rbA.setText(mBean.getA());
        rbB.setText(mBean.getB());
        rbC.setText(mBean.getC());
        rbD.setText(mBean.getD());
        isRbVisibility();
        setCommitToast();
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                String theAnswer = getTheAnswer(checkedId);
                if (theAnswer.equals(mBean.getAnswer())) {
                    SharedPreferences pref = getContext().getSharedPreferences("data"
                            , Context.MODE_PRIVATE);
                    grade = pref.getInt("grade", 0);
                    Log.i(TAG, "onCheckedChanged: " + grade);
                    grade = grade + 1;
                    Log.i(TAG, "onCheckedChanged: " + grade);
                    SharedPreferences.Editor editor = getContext().getSharedPreferences("data",
                            Context.MODE_PRIVATE).edit();
                    editor.putInt("grade", grade);
                    editor.apply();
                }
            }

            private String getTheAnswer(int checkedId) {
                RadioButton rb = (RadioButton) v.findViewById(mRadioGroup.
                        getCheckedRadioButtonId());
                return rb.getText().toString();
            }
        });

        return v;

    }

    private void setCommitToast() {
        if (mBean.equals(BeanLab.get(getContext()).getBeans().get(29)))
            Toast.makeText(getContext(), "现在可以点击右上角的提交按钮查看成绩", Toast
                    .LENGTH_SHORT).show();
    }


    private void isRbVisibility() {
        if (D == null) {
            rbD.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.toolbar, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
//            case R.id.backup:
//                return true;
            case R.id.exit:
                Intent intent = new Intent(getContext(), GradeActivity.class);
                startActivity(intent);
                return true;
            default:
                return true;
        }
    }
}
