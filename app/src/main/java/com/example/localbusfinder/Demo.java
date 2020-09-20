package com.example.localbusfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Demo extends AppCompatActivity {

    TextView textView;
    EditText editText1,editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        button = findViewById(R.id.btn);
        editText1 = findViewById(R.id.ed1);
        editText2 = findViewById((R.id.ed2));
        textView = findViewById(R.id.tv);
    }

    public void getval(View v){
        int val1 = Integer.parseInt(editText1.getText().toString().trim());
        int val2 = Integer.parseInt(editText2.getText().toString().trim());
        int r = val1+val2;
        textView.setText(Integer.toString(r));
        editText1.setText("");
        editText2.setText("");
    }



}