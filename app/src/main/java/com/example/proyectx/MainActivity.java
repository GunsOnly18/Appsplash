package com.example.proyectx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler( ).postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent Intent= new Intent( MainActivity.this , Login.class );
                startActivity( Intent );
                finish( );
            }
        }, 4000 );

    }
}