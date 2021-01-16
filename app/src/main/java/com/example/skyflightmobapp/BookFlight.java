package com.example.skyflightmobapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookFlight extends AppCompatActivity {
    private Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_flight);


        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBaggageDetails();
            }
        });
    }

    public void openBaggageDetails(){
        Intent intent = new Intent (this, BaggageDetails.class);
        startActivity(intent);
    }
}