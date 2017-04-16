package com.example.sijinsixin.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.sijinsixin.HomeImageHandler;
import com.example.sijinsixin.R;
import com.example.sijinsixin.ui.activity.HomeContentActivity;
import com.example.sijinsixin.ui.activity.MainActivity;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/**
 * Created by 鲍骞月 on 2017/4/15.
 */

public class HomeFragment extends Fragment implements View.OnClickListener {
    public HomeImageHandler handler = new HomeImageHandler(new
            WeakReference<HomeFragment>(this));
    public ViewPager mHomePager;
    private ImageView imgBasic;
    private ImageView imgHistory;
    private ImageView imgliangxue;
    private ImageView imgtradtion;

    public static Fragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initView(view);
        initHomePagerView();
        return view;
    }


    private void initView(View view) {
        mHomePager = (ViewPager) view.findViewById(R.id.home_viewpager);
        imgBasic = (ImageView) view.findViewById(R.id.img_basic);
        imgHistory = (ImageView) view.findViewById(R.id.img_party_history);
        imgliangxue = (ImageView) view.findViewById(R.id.img_liangxueyizuo);
        imgtradtion = (ImageView) view.findViewById(R.id.img_tradtion);
        imgBasic.setOnClickListener(this);
        imgHistory.setOnClickListener(this);
        imgliangxue.setOnClickListener(this);
        imgtradtion.setOnClickListener(this);
    }

    private void initHomePagerView() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        FrameLayout view1 = (FrameLayout) inflater.inflate(R.layout.home_viewpager_item, null);
        FrameLayout view2 = (FrameLayout) inflater.inflate(R.layout.home_viewpager_item1, null);
        FrameLayout view3 = (FrameLayout) inflater.inflate(R.layout.home_viewpager_item2, null);
//        view1.setImageResource(R.drawable.homeimg);
//        view2.setImageResource(R.drawable.homeimg1);
//        view3.setImageResource(R.drawable.homeimg2);
        ArrayList<FrameLayout> views = new ArrayList<FrameLayout>();
        views.add(view1);
        views.add(view2);
        views.add(view3);
        mHomePager.setAdapter(new MainActivity.HomepagerAdapter(views));
        mHomePager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {
                handler.sendMessage(Message.obtain(handler, HomeImageHandler.MSG_PAGE_CHANGED, arg0, 0));
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                switch (state) {
                    case ViewPager.SCROLL_STATE_DRAGGING:
                        handler.sendEmptyMessage(HomeImageHandler.MSG_KEEP_SILENT);
                        break;
                    case ViewPager.SCROLL_STATE_IDLE:
                        handler.sendEmptyMessageDelayed(HomeImageHandler.MSG_UPDATE_IMAGE,
                                HomeImageHandler.MSG_DELAY);
                        break;
                    default:
                        break;
                }
            }
        });
        mHomePager.setCurrentItem(Integer.MAX_VALUE);
        handler.sendEmptyMessageDelayed(HomeImageHandler.MSG_UPDATE_IMAGE,
                HomeImageHandler.MSG_DELAY);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_basic:
                Intent intent = new Intent(getContext(), HomeContentActivity.class);
                intent.putExtra("targetUrl", "http://baike.baidu.com/item/%E5%" +
                        "9B%9B%E8%BF%9B%E5%9B%9B%E4%BF%A1?sefr=cr");
                startActivity(intent);
                break;
            case R.id.img_party_history:
                Intent intent1 = new Intent(getContext(), HomeContentActivity.class);
                intent1.putExtra("targetUrl", "http://baike.baidu.com/item/%E4%B8%AD%E5%9B%BD%" +
                        "E5%85%B1%E4%BA%A7%E5%85%9A?sefr=cr");
                startActivity(intent1);
                break;
            case R.id.img_liangxueyizuo:
                Intent intent2 = new Intent(getContext(), HomeContentActivity.class);
                intent2.putExtra("targetUrl", "http://baike.baidu.com/item/%E2%80%9C%E4%B8%A4" +
                        "%E5%AD%A6%E4%B8%80%E5%81%9A%E2%80%9D%E5%AD%A6%E4%B9%A0%E6%95%99%E8" +
                        "%82%B2?fromtitle=%E4%B8%A4%E5%AD%A6%E4%B8%80%E5%81%" +
                        "9A&fromid=19422481&type=syn&sefr=cr");
                startActivity(intent2);
                break;
            case R.id.img_tradtion:
                Intent intent3 = new Intent(getContext(), HomeContentActivity.class);
                intent3.putExtra("targetUrl", "http://baike.baidu.com/item/%E4%BC%A0%E7%BB%9F" +
                        "%E6%96%87%E5%8C%96?sefr=cr");
                startActivity(intent3);
                break;
            default:
                break;
        }
    }


}
