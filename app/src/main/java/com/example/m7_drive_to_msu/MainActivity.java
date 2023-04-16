package com.example.m7_drive_to_msu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openGoogleMaps(View view) {
        // Pass a google navigation intent to the android system.
        // Launch in mode=d for driving navigation from current location.
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Montclair+State+University,+Montclair+NJ&mode=d");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        // Request map app as handler for the intent.
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
}