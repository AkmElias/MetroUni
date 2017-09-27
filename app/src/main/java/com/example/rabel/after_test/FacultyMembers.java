package com.example.rabel.after_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FacultyMembers extends AppCompatActivity {
    Button cs_btn, ee_btn, busi_btn, eng_btn, eco_btn, lw_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_members);

        cs_btn = (Button) findViewById(R.id.CSE_imgBtn);
        cs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FacultyMembers.this, CseDept.class);
                startActivity(intent);
            }
        });

        ee_btn = (Button) findViewById(R.id.EEE_img);
        ee_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FacultyMembers.this, EeeDept.class);
                startActivity(intent);
            }
        });

        busi_btn = (Button) findViewById(R.id.Business_img);
        busi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FacultyMembers.this, BusinessDept.class);
                startActivity(intent);
            }
        });


        eco_btn = (Button) findViewById(R.id.Eco_img);
        eco_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FacultyMembers.this, EconomicsDept.class);
                startActivity(intent);
            }
        });

        eng_btn = (Button) findViewById(R.id.English_img);
        eng_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FacultyMembers.this, EnglishDept.class);
                startActivity(intent);
            }
        });

        lw_btn = (Button) findViewById(R.id.Low_img);
        lw_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FacultyMembers.this, Law_Dept.class);
                startActivity(intent);
            }
        });
    }
}
