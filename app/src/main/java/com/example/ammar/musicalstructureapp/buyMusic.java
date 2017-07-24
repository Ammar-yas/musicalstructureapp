package com.example.ammar.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class buyMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_music);
        Button yourLibrary = (Button) findViewById(R.id.your_library_button);
        yourLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(buyMusic.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
