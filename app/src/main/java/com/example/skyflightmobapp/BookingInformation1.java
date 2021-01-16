package com.example.skyflightmobapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookingInformation1 extends AppCompatActivity {
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_information1);


        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBookingInformation2();
            }
        });
    }

    public void openBookingInformation2(){
        Intent intent = new Intent (this, BookingInformation2.class);
        startActivity(intent);
    }
}