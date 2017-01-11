package com.example.devin.q4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClick = (Button)findViewById(R.id.button);
        btnClick.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        count++;

        EditText etResult = (EditText)findViewById(R.id.editText);
        String msg = "You clicked button " + count +" times";
        etResult.append(msg + "\n");

        Log.d("Q4", msg);
    }
}
