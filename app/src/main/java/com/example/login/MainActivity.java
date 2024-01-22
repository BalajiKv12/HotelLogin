package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Login;
    Button Signup;
    EditText name, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = findViewById(R.id.login);
        Signup = findViewById(R.id.Signup);
        name = findViewById(R.id.Name);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.Password);


            Login.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View view) {
                    String n = name.getText().toString();
                    String e = email.getText().toString();
                    String p = password.getText().toString();
                    if (n.isEmpty() || e.isEmpty() || p.isEmpty())
                    {
                        android.widget.Toast.makeText(getApplicationContext(), "Please enter all fields", Toast.LENGTH_SHORT).show();
                    }
                    else{
                    String Str = "Welcome back " + name.getText().toString();
                    Intent second = new Intent(getApplicationContext(), MainActivity1.class);
                    second.putExtra("Message", Str);
                    android.widget.Toast.makeText(getApplicationContext(), "Logging IN", Toast.LENGTH_SHORT).show();
                    startActivity(second);
                }
            }
            });

            Signup.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    String n = name.getText().toString();
                    String e = email.getText().toString();
                    String p = password.getText().toString();
                    if (n.isEmpty() || e.isEmpty() || p.isEmpty()) {
                        android.widget.Toast.makeText(getApplicationContext(), "Please enter all fields", Toast.LENGTH_SHORT).show();
                    } else {
                        String Str = "Welcome " + name.getText().toString();
                        Intent second = new Intent(getApplicationContext(), MainActivity1.class);
                        second.putExtra("Message", Str);
                        android.widget.Toast.makeText(getApplicationContext(), "Signing Up", Toast.LENGTH_SHORT).show();
                        startActivity(second);
                    }
                }
            });
    }
}