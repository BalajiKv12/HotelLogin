package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    TextView welcome;
    CardView Veg;
    CardView nonVeg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        welcome = findViewById(R.id.welcome);
        Intent second = getIntent();
        String str = second.getStringExtra("Message");
        welcome.setText(str);

        Veg = findViewById(R.id.VegCard);
        Veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent vege = new Intent(getApplicationContext(), VegActivity.class);
                startActivity(vege);
            }
        });

        nonVeg = findViewById(R.id.NonVegCard);
        nonVeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nonVege = new Intent(getApplicationContext(), NonVegActivity.class);
                startActivity(nonVege);
            }
        });
    }
}