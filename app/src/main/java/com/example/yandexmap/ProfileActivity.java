package com.example.yandexmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    ImageView fix,search,main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fix = findViewById(R.id.fix);
        search = findViewById(R.id.search);
        main = findViewById(R.id.main);

        final Intent goFix = new Intent(ProfileActivity.this, FixActivity.class);
        final Intent goMain = new Intent(ProfileActivity.this, MainActivity.class);
        final Intent goSearch = new Intent(ProfileActivity.this, SearchActivity.class);

        fix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(goFix);
            }
        });
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(goMain);
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