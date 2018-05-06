package com.example.android.businesscard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToFB (View view) {
        String url = "https://www.facebook.com/loveLunaCatz/";
        Uri website = Uri.parse(url);
        Intent webViewIntent = new Intent(Intent.ACTION_VIEW, website);
        startActivity(webViewIntent);
    }

    public void goToInsta (View view) {
        String url = "https://www.instagram.com/lovelunacatz/";
        Uri website = Uri.parse(url);
        Intent webViewIntent = new Intent(Intent.ACTION_VIEW, website);
        startActivity(webViewIntent);
    }

    public void goToTwitter (View view) {
        String url = "https://twitter.com/lovelunacatz";
        Uri website = Uri.parse(url);
        Intent webViewIntent = new Intent(Intent.ACTION_VIEW, website);
        startActivity(webViewIntent);
    }
}
