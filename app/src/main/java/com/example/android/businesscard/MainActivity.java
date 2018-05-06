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
 
    //Takes user to Facebook website upon icon click.
    public void goToFB (View view) {
        String url = "https://www.facebook.com/loveLunaCatz/";
        Uri website = Uri.parse(url);
        Intent webViewIntent = new Intent(Intent.ACTION_VIEW, website);
        view.getContext().startActivity(webViewIntent);
    }

    //Takes user to Instagram website upon icon click.
    public void goToInsta (View view) {
        String url = "https://www.instagram.com/lovelunacatz/";
        Uri website = Uri.parse(url);
        Intent webViewIntent = new Intent(Intent.ACTION_VIEW, website);
        view.getContext().startActivity(webViewIntent);
    }

    //Takes user to Twitter website upon icon click.
    public void goToTwitter (View view) {
        String url = "https://twitter.com/lovelunacatz";
        Uri website = Uri.parse(url);
        Intent webViewIntent = new Intent(Intent.ACTION_VIEW, website);
        view.getContext().startActivity(webViewIntent);
    }
}
