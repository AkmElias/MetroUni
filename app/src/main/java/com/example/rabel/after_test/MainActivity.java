package com.example.rabel.after_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button home_btn, prog_btn, acd_btn, curr_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home_btn = (Button) findViewById(R.id.Homebtn);
        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        prog_btn = (Button) findViewById(R.id.ProgrameesBtn);
        prog_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Programees.class);
                startActivity(intent);
            }
        });

        acd_btn = (Button) findViewById(R.id.AcademicHomeBtn);
        acd_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Academic.class);
                startActivity(intent);
            }
        });

        curr_btn = (Button) findViewById(R.id.current_studentsBtn);
        curr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CurrentStudents.class);
                startActivity(intent);
            }
        });
    }
}
