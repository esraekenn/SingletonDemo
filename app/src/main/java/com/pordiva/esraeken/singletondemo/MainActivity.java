package com.pordiva.esraeken.singletondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    SingletonDemo instance=SingletonDemo.getInstance();
         instance.printHello();
    }

}
