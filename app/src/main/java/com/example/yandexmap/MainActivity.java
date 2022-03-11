package com.example.yandexmap;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yandexmap.FixActivity;
import com.example.yandexmap.ProfileActivity;
import com.example.yandexmap.R;
import com.example.yandexmap.SearchActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    ImageView fix,search,profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fix = findViewById(R.id.fix);
        search = findViewById(R.id.search);
        profile = findViewById(R.id.profile);




        final Intent goFix = new Intent(MainActivity.this, FixActivity.class);
        final Intent goProfile = new Intent(MainActivity.this, ProfileActivity.class);
        final Intent goSearch = new Intent(MainActivity.this, SearchActivity.class);

        fix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(goFix);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(goProfile);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(goSearch);
            }
        });
    }
}