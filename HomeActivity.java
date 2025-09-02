package com.example.walter;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private EditText searchEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        searchEditText = findViewById(R.id.etSearch);


        searchEditText.setOnEditorActionListener((v, actionId, event) -> {
            String searchQuery = searchEditText.getText().toString();
            if (!searchQuery.isEmpty()) {
                Toast.makeText(HomeActivity.this,
                        "Searching for: " + searchQuery,
                        Toast.LENGTH_SHORT).show();

            }
            return true;
        });


        Toast.makeText(this, "Welcome to TechPulse!", Toast.LENGTH_SHORT).show();
    }
}