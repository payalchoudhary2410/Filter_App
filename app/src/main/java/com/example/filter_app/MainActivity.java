package com.example.filter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import Test_Apply.Edit_Test_Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent i=new Intent(MainActivity.this, Edit_Test_Activity.class);
            startActivity(i);
            finish();

        }
    },1000);

    zoom();


}

    public void zoom(){
        ImageView image = (ImageView)findViewById(R.id.imageView);
        TextView welcome= (TextView)findViewById(R.id.textView);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.zoomin);
        image.startAnimation(animation1);
        welcome.startAnimation(animation1);
    }
}