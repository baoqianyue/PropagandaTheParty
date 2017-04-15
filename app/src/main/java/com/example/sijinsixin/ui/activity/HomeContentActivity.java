package com.example.sijinsixin.ui.activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.example.sijinsixin.ui.fragment.HomeContentFragment;
import com.example.sijinsixin.R;

/**
 * Created by 鲍骞月 on 2017/4/14.
 */

public class HomeContentActivity extends SingleFragmentActivity{
    private static final String TAG = "HomeContentActivity";
    public String mURL;

    @Override
    protected Fragment createFragment() {
        Intent intent = getIntent();
        mURL = intent.getStringExtra("targetUrl");
        Log.i(TAG, mURL);
        return new HomeContentFragment(mURL);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_web_content;
    }

    @Override
    public int getContainerId() {
        return R.id.web_view;
    }
}
