package com.example.week1c;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class secondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Bundle extras = getIntent().getExtras();

        String value1 = extras.getString("Value1");

        TextView tv = (TextView) findViewById(R.id.textView3);
        tv.setText(value1);
        //Toast.makeText(getApplicationContext(),"Hello : "+value1, Toast.LENGTH_LONG).show();
    }
}