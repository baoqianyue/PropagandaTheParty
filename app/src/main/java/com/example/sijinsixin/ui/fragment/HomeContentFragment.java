package com.example.sijinsixin.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.sijinsixin.R;

/**
 * Created by 鲍骞月 on 2017/4/14.
 */

public class HomeContentFragment extends Fragment {
    private static final String TAG = "HomeContentFragment";
    private static final String APP_CACHE_DIRNAME = "/webcache";
    private String mURL;
    private WebView webView;

    public HomeContentFragment(String url) {
        this.mURL = url;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = View.inflate(getContext(), R.layout.fragment_web_content, null);
        webView = (WebView) v.findViewById(R.id.web_view);
        Log.i(TAG, mURL);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        /**
         * 设置WebView的缓存
         */
        //设置缓存模式
        webView.getSettings().setDomStorageEnabled(true);
        //webView.getSettings().setAppCacheMaxSize(1024*1024*10);
        //开启database storage API功能
        webView.getSettings().setDatabaseEnabled(true);
        String cacheDirPath = getActivity().getApplicationContext().getDir("cache",
                Context.MODE_PRIVATE).getPath();
        //设置数据库缓存路径
        webView.getSettings().setAppCachePath(cacheDirPath);
        webView.getSettings().setAllowFileAccess(true);
        //开启缓存
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.loadUrl(mURL);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_web_content, container, false);
        webView = (WebView) v.findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setDomStorageEnabled(true);
        //webView.getSettings().setAppCacheMaxSize(1024*1024*10);
        //开启database storage API功能
        webView.getSettings().setDatabaseEnabled(true);
        String cacheDirPath = getActivity().getApplicationContext().getDir("cache",
                Context.MODE_PRIVATE).getPath();
        //设置数据库缓存路径
        webView.getSettings().setAppCachePath(cacheDirPath);
        webView.getSettings().setAllowFileAccess(true);
        //开启缓存
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.loadUrl(mURL);
        return v;
    }
}
