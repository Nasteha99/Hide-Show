package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         imageView = findViewById(R.id.imageV);
         button = findViewById(R.id.btn);

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(imageView.getVisibility() == view.VISIBLE){
                     imageView.setVisibility(View.GONE);
                 }else{
                     imageView.setVisibility(View.VISIBLE);
                 }
             }
         });

    }
}