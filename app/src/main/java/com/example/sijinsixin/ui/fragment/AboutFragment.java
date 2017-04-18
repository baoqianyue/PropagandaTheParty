package com.example.sijinsixin.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sijinsixin.R;

/**
 * Created by 鲍骞月 on 2017/4/18.
 */

public class AboutFragment extends Fragment {
//    private Button btnYuandangwei;
//    private Button btnYuantuanwei;
//    private Button btnAndroidLab;

    public static Fragment newInstance() {
        return new AboutFragment();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable
            ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);
//        btnYuandangwei = (Button) view.findViewById(R.id.yuandangwei);
//        btnYuantuanwei = (Button) view.findViewById(R.id.yuantuanwei);
//        btnAndroidLab = (Button) view.findViewById(R.id.androidlab);
        return view;
    }
}
