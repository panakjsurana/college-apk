package com.example.dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PDFActivity extends AppCompatActivity {
    private TextView TEXT;
    private PDFView pdfView;
    private FirebaseDatabase database=FirebaseDatabase.getInstance();
    DatabaseReference mref=database.getReference("url");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        pdfView=(PDFView)findViewById(R.id.pdfView);
        TEXT=(TextView)findViewById(R.id.TEXT);
        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value =dataSnapshot.getValue(String.class);
                TEXT.setText(value);
                Toast.makeText(PDFActivity.this, "Updated", Toast.LENGTH_SHORT).show();
                String url=TEXT.getText().toString();
                new RetrivePdfStrem().execute(url);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(PDFActivity.this, "Failed to load", Toast.LENGTH_SHORT).show();
            }
        });}
        class RetrivePdfStrem extends AsyncTask<String,Void, InputStream>
        {

            @Override
            protected InputStream doInBackground(String... strings) {
                InputStream inputStream=null;
                try {
                    URL url=new URL(strings[0]);
                    HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
                    if (urlConnection.getResponseCode()==200)
                    {
                        inputStream=new BufferedInputStream(urlConnection.getInputStream());

                    }
                }catch (IOException e){
                    return null;

                }
                return inputStream;
            }

            @Override
            protected void onPostExecute(InputStream inputStream) {
                pdfView.fromStream(inputStream).load();
            }
        }
    }

