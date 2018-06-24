package com.example.hitman.guessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText one=(EditText) findViewById(R.id.edit);
        one.setText(getIntent().getStringExtra("s"));
    }
}
