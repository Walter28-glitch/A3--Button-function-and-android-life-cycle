package com.example.walter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private EditText searchEditText;
    private Button profileButton;
    private Button settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        searchEditText = findViewById(R.id.etSearch);
        profileButton = findViewById(R.id.btnProfile);
        settingsButton = findViewById(R.id.btnSettings);


        searchEditText.setOnEditorActionListener((v, actionId, event) -> {
            String searchQuery = searchEditText.getText().toString();
            if (!searchQuery.isEmpty()) {
                Toast.makeText(HomeActivity.this,
                        "Searching for: " + searchQuery,
                        Toast.LENGTH_SHORT).show();
            }
            return true;
        });


        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Profile button clicked", Toast.LENGTH_SHORT).show();

            }
        });


        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Settings button clicked", Toast.LENGTH_SHORT).show();

            }
        });

        Toast.makeText(this, "Welcome to TechPulse!", Toast.LENGTH_SHORT).show();
    }
}
