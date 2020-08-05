package com.example.filter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class App_Main_Page extends AppCompatActivity {

    ImageView edit;
    ImageView filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app__main__page);
        edit=findViewById(R.id.edit);
        filter=findViewById(R.id.filter);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(App_Main_Page.this,Edit_Activity.class);
            }
        });

    filter.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(App_Main_Page.this,Filter_Activity.class);
        }
    });
}
}