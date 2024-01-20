package com.example.finalllllllllllllllivesycle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

        Log.d("Life","onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Life","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Life","onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life","onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        finish();
        Log.d("Life","onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Life","onDestroy()");
    }
}