package com.example.enterprise.ui3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_main);  //   layout from activity_main.xml

        TextView myTextView = new TextView(this);  // new layout from the next 3 lines of code with only textview
        setContentView(myTextView);
        myTextView.setText("Hello world.........");

//        Button MyButton = new Button(this);    //Try also this code to see what happening.
//        setContentView(MyButton);
//        MyButton.setX(200);
//        MyButton.setY(200);
//        MyButton.setText("hello");


    }
}
