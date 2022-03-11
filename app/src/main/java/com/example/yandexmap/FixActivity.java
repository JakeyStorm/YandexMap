package com.example.yandexmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FixActivity extends AppCompatActivity {
    ImageView main,search,profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = findViewById(R.id.main);
        search = findViewById(R.id.search);
        profile = findViewById(R.id.profile);

        final Intent goMain = new Intent(FixActivity.this, MainActivity.class);
        final Intent goProfile = new Intent(FixActivity.this, ProfileActivity.class);
        final Intent goSearch = new Intent(FixActivity.this, SearchActivity.class);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(goMain);
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