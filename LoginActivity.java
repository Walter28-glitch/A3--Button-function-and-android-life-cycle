package com.example.walter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private Button loginButton;
    private TextView registerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        loginButton = findViewById(R.id.btnLogin);
        registerTextView = findViewById(R.id.tvRegisterHere);


        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, com.example.walter.HomeActivity.class);
            startActivity(intent);
        });


        registerTextView.setOnClickListener(v -> {
            Toast.makeText(this, "Register clicked!", Toast.LENGTH_SHORT).show();
            // You can add registration activity navigation here
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart() called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume() called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause() called", Toast.LENGTH_SHORT).show();
    }
}