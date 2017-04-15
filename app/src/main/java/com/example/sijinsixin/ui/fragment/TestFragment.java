package com.example.sijinsixin.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.sijinsixin.App;
import com.example.sijinsixin.R;
import com.example.sijinsixin.bean.Bean;
import com.example.sijinsixin.bean.BeanLab;

import java.util.UUID;

/**
 * Created by 鲍骞月 on 2017/4/15.
 */

public class TestFragment extends Fragment {
    private static final String BEAN_ID = "bean_id";
    private static final String TAG = "TestFragment";
    private String D;
    private Bean mBean;
    private TextView tvTitle;
    private RadioGroup mRadioGroup;
    private RadioButton rbA;
    private RadioButton rbB;
    private RadioButton rbC;
    private RadioButton rbD;


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
        View v = inflater.inflate(R.layout.fragment_test, container, false);

        tvTitle = (TextView) v.findViewById(R.id.tv_test_title);
        tvTitle.setText(mBean.getTitle());
        mRadioGroup = (RadioGroup) v.findViewById(R.id.rg_test_item);
        rbA = (RadioButton) v.findViewById(R.id.rb_test_a);
        rbB = (RadioButton) v.findViewById(R.id.rb_test_b);
        rbC = (RadioButton) v.findViewById(R.id.rb_test_c);
        rbD = (RadioButton) v.findViewById(R.id.rb_test_d);
        D = mBean.getD();
        rbA.setText(mBean.getA());
        rbB.setText(mBean.getB());
        rbC.setText(mBean.getC());
        rbD.setText(mBean.getD());

        isRbVisibility();
        return v;

    }

    private void isRbVisibility() {
        if (D == null) {
            rbD.setVisibility(View.INVISIBLE);
        }
    }
}
