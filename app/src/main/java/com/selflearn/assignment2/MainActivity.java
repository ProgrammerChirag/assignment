package com.selflearn.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;

import com.chaos.view.PinView;

public class MainActivity extends AppCompatActivity {

    PinView pinView;

    Button get_otp, login;

    EditText user_name , password , mobile_number;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pinView = findViewById(R.id.pin_view);
        get_otp=findViewById(R.id.get_OTP);
        login=findViewById(R.id.loginbtn);
        user_name=findViewById(R.id.username);
        password=findViewById(R.id.password);
        mobile_number=findViewById(R.id.number);


        pinView.setAnimationEnable(true);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , ProfileActivity.class);
                finish();
                startActivity(intent);
            }
        });


    }
}