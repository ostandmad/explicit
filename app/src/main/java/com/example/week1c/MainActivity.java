package com.example.week1c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import android.view.View;
public class MainActivity extends AppCompatActivity {

    private EditText edittext1;
    private Button buttonSum;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext1 = (EditText) findViewById(R.id.editTextTextPersonName);
        buttonSum = (Button) findViewById(R.id.button);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), secondActivity.class);
                String value1=edittext1.getText().toString();

                i.putExtra("Value1",value1);
                startActivity(i);
            }
        });
    }
}