package com.example.rabel.after_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button ab_btn, advis_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        ab_btn = (Button) findViewById(R.id.aboutUsBtn);
        ab_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,AboutUs.class);
                startActivity(intent);
            }
        });

        advis_btn = (Button) findViewById(R.id.AdvisoryBtn);
        advis_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,AdvisoryBoard.class);
                startActivity(intent);
            }
        });
    }
}
