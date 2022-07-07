package com.ridhamad.a10119251latihanapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        Loading();
    }

    void Loading(){
        new Thread(){
            public  void run(){
                try {
                    Thread.sleep(3000);
                }catch(Exception ee){ }
                Intent i=new Intent(Loading.this, MainActivity.class);
                Loading.this.finish();
                startActivity(i);
            }}.start();
    }
}