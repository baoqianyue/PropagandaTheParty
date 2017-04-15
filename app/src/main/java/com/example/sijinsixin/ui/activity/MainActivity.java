package com.example.sijinsixin.ui.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

import com.example.sijinsixin.R;
import com.example.sijinsixin.ui.fragment.HomeFragment;
import com.example.sijinsixin.ui.fragment.TestStartFragment;

import java.util.ArrayList;

public class MainActivity extends SingleFragmentActivity implements
        BottomNavigationView.OnNavigationItemSelectedListener {
    public BottomNavigationView navigationView;

    @Override
    protected Fragment createFragment() {
        return HomeFragment.newInstance();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public int getContainerId() {
        return R.id.fragment_container;
    }

    @Override
    public void init() {
        super.init();
        navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_home:
                switchFragment(HomeFragment.newInstance());
                break;
            case R.id.navigation_dashboard:
//                    Intent intent = new Intent(MainActivity.this, TestActivity.class);
//                    startActivity(intent);
//                switchFragment(TestFragment.newInstance(BeanLab.
//                        get(App.getContext()).getBeans().get(0).getId()));
                switchFragment(TestStartFragment.newInstance());
                break;
            case R.id.navigation_notifications:
                break;
        }
        return true;
    }


    public static class HomepagerAdapter extends PagerAdapter {
        private ArrayList<FrameLayout> viewList;

        public HomepagerAdapter(ArrayList<FrameLayout> viewList) {
            this.viewList = viewList;
        }

        @Override
        public int getCount() {
            return Integer.MAX_VALUE;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            position %= viewList.size();
            if (position < 0) {
                position = viewList.size() + position;
            }
            FrameLayout view = viewList.get(position);
            //如果View已经在之前添加到了一个父组件，则必须先remove，否则会抛出IllegalStateException。
            ViewParent vp = view.getParent();
            if (vp != null) {
                ViewGroup parent = (ViewGroup) vp;
                parent.removeView(view);
            }
            container.addView(view);
            //add listeners here if necessary
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
        }
    }

}
