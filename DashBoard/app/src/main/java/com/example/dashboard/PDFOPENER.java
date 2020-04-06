package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOPENER extends AppCompatActivity {

    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);
        myPDFViewer=(PDFView)findViewById(R.id.pdfViewer);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("BTech-Mech-Syllabus12_13")){

            myPDFViewer.fromAsset("BTech-Mech-Syllabus12_13.pdf").load();
        }
        if (getItem.equals("BTech_Syllabus-EE-3-8-Sem")){

            myPDFViewer.fromAsset("BTech_Syllabus-EE-3-8-Sem.pdf").load();
        }
        if (getItem.equals("BTech_Civil_syllabi_12-13")){

            myPDFViewer.fromAsset("BTech_Civil_syllabi_12-13.pdf").load();
        }
        if (getItem.equals("CS_3_8_syllabus 07102015")){

            myPDFViewer.fromAsset("CS_3_8_syllabus 07102015.pdf").load();
        }
        if (getItem.equals("GS Mcq Mock Test-1")){

            myPDFViewer.fromAsset("GS Mcq Mock Test-1.pdf").load();
        }
        if (getItem.equals("GS Mcq Mock Test-2")){

            myPDFViewer.fromAsset("GS Mcq Mock Test-2.pdf").load();
        }
        if (getItem.equals("Hindi Adv_July 2019 6_0")){

            myPDFViewer.fromAsset("Hindi Adv_July 2019 6_0.pdf").load();
        }
        if (getItem.equals("Rajasthan Geography")){
            myPDFViewer.fromAsset("Rajasthan Geography.pdf").load();


        }
    }
}
