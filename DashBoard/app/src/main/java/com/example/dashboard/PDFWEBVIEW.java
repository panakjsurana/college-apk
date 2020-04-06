package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PDFWEBVIEW extends AppCompatActivity {
    private WebView mWebview;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_w_e_b_v_i_e_w);

            mWebview = new WebView(this);
            mWebview.getUrl();
            setContentView(mWebview);
    }
}
