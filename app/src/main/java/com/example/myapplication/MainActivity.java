package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);

        button2=findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog=new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.alartdailog);
                ImageView image=dialog.findViewById(R.id.image1);
                image.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "i  am a tost", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();


            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BlankFragment blankFragment=new BlankFragment();

                blankFragment.show(getSupportFragmentManager(),blankFragment.getTag());

                ImageView image1=findViewById(R.id.image);









            }
        });










    }
}