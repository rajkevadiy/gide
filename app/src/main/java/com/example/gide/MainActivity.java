package com.example.gide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    WebView web;
   // ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       web=findViewById(R.id.web);

       web.loadUrl("https://web.whatsapp.com/");
       web.setWebViewClient(new WebViewClient());






        //img=findViewById(R.id.img);



       // Glide.with(MainActivity.this).load("https://cdn.wallpapersafari.com/0/17/iF9QLo.jpg").into(img);
    }
}