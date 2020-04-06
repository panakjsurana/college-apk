package com.example.dashboard;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class Main3Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    Vector<Youtubevideos> youtubeVideos = new Vector<Youtubevideos>();
    private Object VideoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        youtubeVideos.add( new Youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Qis-J-3PUb0\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>") );
        youtubeVideos.add( new Youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/S8SPfE_-fcU\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>") );
        youtubeVideos.add( new Youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eNQ3lPeiMOc\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>") );
        youtubeVideos.add( new Youtubevideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/P156VjNAqjY\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>") );


        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);
    }
}
