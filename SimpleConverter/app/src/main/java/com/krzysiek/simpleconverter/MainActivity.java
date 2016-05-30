package com.krzysiek.simpleconverter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editkilometer = (EditText) findViewById(R.id.editkilometer);

        final EditText editmiles = (EditText) findViewById(R.id.editmile);

        Button button = (Button)findViewById(R.id.buttonConverter);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                double kilometer = Double.valueOf( editkilometer.getText().toString());

                double miles = kilometer *  1.609344 ;

                editmiles.setText(String.valueOf(miles));

            }
        });



    }





}