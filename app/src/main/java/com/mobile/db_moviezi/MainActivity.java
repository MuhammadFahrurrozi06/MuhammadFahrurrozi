package com.mobile.db_moviezi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popular(View view) {
        Intent i = new Intent(MainActivity.this, PopularMovie.class);
        startActivity(i);
    }
}
