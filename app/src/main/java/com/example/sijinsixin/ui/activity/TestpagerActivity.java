package com.example.sijinsixin.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.sijinsixin.R;
import com.example.sijinsixin.bean.Bean;
import com.example.sijinsixin.bean.BeanLab;
import com.example.sijinsixin.ui.fragment.TestFragment;

import java.util.List;
import java.util.UUID;

/**
 * Created by 鲍骞月 on 2017/4/15.
 */

public class TestpagerActivity extends AppCompatActivity {

    public static final String BEAN_ID = "bean_id";
    private static final String TAG = "TestpagerActivity";
    private ViewPager mViewPager;
    private List<Bean> mBeans;

    public static Intent newIntent(Context context, UUID beanId) {
        Intent intent = new Intent(context, TestpagerActivity.class);
        intent.putExtra(BEAN_ID, beanId);
        return intent;
    }

//    @Override
//    protected Fragment createFragment() {
//        UUID beanId = (UUID) getIntent().getSerializableExtra(BEAN_ID);
//        return TestFragment.newInstance(beanId);
//    }
//
//    @Override
//    public int getLayoutResId() {
//        return R.layout.fragment_test;
//    }
//
//    @Override
//    public int getContainerId() {
//        return R.id.fragment_container;
//    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_pager);
        final UUID beanId = (UUID) getIntent().getSerializableExtra(BEAN_ID);
//        *//*if (null == beanId)
//            Log.i(TAG, "onCreate: beanid is null");*//*
//        Log.i(TAG, beanId.toString());
        mViewPager = (ViewPager) findViewById(R.id.activity_test_pager_view_pager);

        mBeans = BeanLab.get(this).getBeans();
        FragmentManager fragmentManager = getSupportFragmentManager();
//        mViewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager) {
//            @Override
//            public Fragment getItem(int position) {
//                Bean bean = mBeans.get(position);
//                return TestFragment.newInstance(bean.getId());
//            }
//
//            @Override
//            public int getCount() {
//                return mBeans.size();
//            }
//        });
        mViewPager.setAdapter(new FragmentPagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int position) {
                Bean bean = mBeans.get(position);
                return TestFragment.newInstance(bean.getId());
            }

            @Override
            public int getCount() {
                return mBeans.size();
            }
        });


        for (int i = 0; i < mBeans.size(); i++) {
            if (beanId.equals(mBeans.get(i).getId())) {
                mViewPager.setCurrentItem(i);
                break;
            }
        }
    }
}
