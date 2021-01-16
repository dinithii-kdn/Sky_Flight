package com.example.skyflightmobapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signin extends AppCompatActivity {
    private Button button3;
    public String password;
    public String email;

    public Signin(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWelcomePage();
            }
        });


    }

    public String toString() {
        return "Signin {" +
                "name='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';



    public void openWelcomePage(){
        Intent intent = new Intent (this, WelcomePage.class);
        startActivity(intent);
    }
}
