package com.example.dashboard;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Syllabus extends AppCompatActivity {

    ListView pdfListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        pdfListView = (ListView) findViewById(R.id.myPDFList);

        String[] pdfFiles = {"BTech-Mech-Syllabus12_13", "BTech_Syllabus-EE-3-8-Sem", "BTech_Civil_syllabi_12-13", "CS_3_8_syllabus 07102015", "GS Mcq Mock Test-1",
                "GS Mcq Mock Test-2", "Hindi Adv_July 2019 6_0", "Rajasthan Geography"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pdfFiles) {

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);

                TextView myText = (TextView) view.findViewById(android.R.id.text1);
                return view;
            }
        };

        pdfListView.setAdapter(adapter);

        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                String itme = pdfListView.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(), com.example.dashboard.PDFOPENER.class);
                start.putExtra("pdfFileName", itme);
                startActivity(start);

            }
        });
    }
}