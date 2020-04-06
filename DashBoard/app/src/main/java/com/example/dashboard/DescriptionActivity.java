package com.example.dashboard;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class DescriptionActivity extends AppCompatActivity {
    private static final String TAG ="DescriptionActivity";
    private Context Context;
    private Bundle extras;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Context = DescriptionActivity.this;
        webView=(WebView) findViewById(R.id.simple_WebView);
        extras=getIntent().getExtras();
        if (extras !=null)
        {

            String data = extras.getString("titles");
            Log.d(TAG,"onCreate:the coming data is"+data);
            String url = "file:///android_asset/"+data+".html";
            webView.loadUrl(url );
            WebSettings webSettings = webView.getSettings();
            webSettings.setBuiltInZoomControls(true);
            webSettings.setDisplayZoomControls(false);

        }

    }
}
