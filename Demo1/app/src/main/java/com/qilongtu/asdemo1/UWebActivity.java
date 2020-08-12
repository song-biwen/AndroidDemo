package com.qilongtu.asdemo1;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UWebActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uweb);

        WebView webview = findViewById(R.id.webview1);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://www.google.com");
    }
}
