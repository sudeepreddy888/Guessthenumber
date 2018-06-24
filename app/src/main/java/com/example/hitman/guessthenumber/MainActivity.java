package com.example.hitman.guessthenumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Random rand = new Random();
    int a=rand.nextInt(100);

    public void Check(View view)
    {
        EditText one = (EditText) findViewById(R.id.edit);
        int n=Integer.parseInt(one.getText().toString());
            if (a == n) {
                Toast.makeText(MainActivity.this, "correct number", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(this,Main2Activity.class);
                i.putExtra("s","correct Number");
                startActivity(i);
                one.setText("");
                a=rand.nextInt(100);
            } else if (n<a) {
                Toast.makeText(MainActivity.this, "smaller number", Toast.LENGTH_SHORT).show();
            } else if (n>a) {
                Toast.makeText(MainActivity.this, "larger number", Toast.LENGTH_SHORT).show();
            }

    }
}
