package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends Activity {
    Button clk;
    TextView hello;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello= (TextView) findViewById(R.id.helloText);
        clk= (Button) findViewById(R.id.change);
        et=(EditText) findViewById(R.id.editText3);

        clk.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                      String s= et.getText().toString();
                      hello.setText(s);
            }
        });
    }
}
