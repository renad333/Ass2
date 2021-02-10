package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    android.widget.Button Button;
    EditText editText;
    TextView textView;
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button =(Button)findViewById(R.id.Button);
        editText = findViewById(R.id.editText);
        textView=(TextView) findViewById(R.id.textView);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                String str="Hello, ";
                String s=editText.getText().toString();
                textView.setText(str+s);
            }
        });
    }

    }






