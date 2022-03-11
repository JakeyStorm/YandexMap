package com.example.yandexmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {
    ImageView fix,main,profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fix = findViewById(R.id.fix);
        main = findViewById(R.id.main);
        profile = findViewById(R.id.profile);

        final Intent goFix = new Intent(SearchActivity.this,FixActivity.class);
        final Intent goProfile = new Intent(SearchActivity.this,ProfileActivity.class);
        final Intent goMain = new Intent(SearchActivity.this,MainActivity.class);
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
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(goMain);
            }
        });
    }
}