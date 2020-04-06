package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_profile,btn_education,btn_health,btn_Notification,btn_finance,btn_comfort,btn_contact,btn_aboutus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_profile =findViewById(R.id.button_profile);
        btn_education =findViewById(R.id.button_Education);
        btn_health =findViewById(R.id.button_Health);
        btn_Notification =findViewById(R.id.button_Notification);
        btn_finance =findViewById(R.id.button_FInance);
        btn_comfort =findViewById(R.id.button_Comfort);
        btn_contact =findViewById(R.id.button_Contact);
        btn_aboutus =findViewById(R.id.button_aboutus);


        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Profile Clicked", Toast.LENGTH_SHORT).show();

            }
        });
        btn_education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        });
        btn_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,Syllabus.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "SYLLABUS Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        btn_Notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,PDFActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Notification Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        btn_finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "LECTURES Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        btn_comfort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "STUDENT ACTIVITY Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        btn_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "CONTACT Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        btn_aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,SliderActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "ABOUTUS Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
