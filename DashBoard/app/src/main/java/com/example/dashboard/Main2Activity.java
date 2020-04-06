package com.example.dashboard;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private static final String    TAG="Main2Activity";
    private Context mContext;
    ArrayList<String> titleArrayList;
    private RecyclerView mRecyclerView;
    private StorageReference mStorageRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mContext= Main2Activity.this;
        titleArrayList =new ArrayList<String>();
        titleArrayList.add(Constants.WHAT_IS_JAVA);
        titleArrayList.add(Constants.HISTORY_OF_JAVA);
        titleArrayList.add(Constants.FEATURES_OF_JAVA);
        titleArrayList.add(Constants.C_VS_JAVA);
        titleArrayList.add(Constants.HELLO_JAVA_PROGRAM);
        titleArrayList.add(Constants.HOW_TO_SET_PATH);
        titleArrayList.add(Constants.JDK_JRE_AND_JVM);
        titleArrayList.add(Constants.INTERNAL_DETAILS_OF_JVM);
        titleArrayList.add(Constants.JAVA_VARIABLES);
        titleArrayList.add(Constants.JAVA_DATA_TYPES);
        titleArrayList.add(Constants.UNICODE_SYSTEM);
        titleArrayList.add(Constants.OPERATORS);
        titleArrayList.add(Constants.web);
        mStorageRef = FirebaseStorage.getInstance().getReference();
        mRecyclerView=(RecyclerView) findViewById(R.id.title_layout_recycler);

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        TitleAdapter adapter = new TitleAdapter(mContext, titleArrayList, new CustomitemClicklistener() {
            @Override
            public void onItemClick(View view, int position)
            {
                Intent desIntent = new Intent(mContext, DescriptionActivity.class);
                desIntent.putExtra("titles",titleArrayList.get(position));
                startActivity(desIntent);



            }
        });
        mRecyclerView.setAdapter(adapter);


    }
}
