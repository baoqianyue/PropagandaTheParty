package com.example.sijinsixin.ui.activity;

import android.support.v4.app.Fragment;

import com.example.sijinsixin.ui.fragment.HomeFragment;
import com.example.sijinsixin.R;

/**
 * Created by 鲍骞月 on 2017/4/15.
 */

public class HomeActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return HomeFragment.newInstance();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home;
    }

    @Override
    public int getContainerId() {
        return R.id.fragment_container;
    }
}
