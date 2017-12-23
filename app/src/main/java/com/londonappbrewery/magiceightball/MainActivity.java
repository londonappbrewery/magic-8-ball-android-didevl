package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ball=(ImageView) findViewById (R.id.ball);

        Button  ASKbutton;
        ASKbutton = (Button)findViewById(R.id.ASKbutton);



        final int ballaray[]={R.drawable.ball1,

                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };
        ASKbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ball", "ze button pressed");

                Random randomNumberGenerator= new Random();

                int Number =randomNumberGenerator.nextInt(5);
                Log.d ("ball", "The Random Number is:" + Number);

                ball.setImageResource(ballaray[Number]);

            }
        });




    }
}


