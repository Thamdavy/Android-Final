package com.example.thamdavy;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_setting);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Find the TextView and set up the onClick listener
        TextView myTextView = findViewById(R.id.main);
        myTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event
                myTextView.setTextColor(getResources().getColor(R.color.white)); // Already set in XML
                myTextView.setTextSize(20); // Already set in XML
                myTextView.setTypeface(myTextView.getTypeface(), Typeface.BOLD); // Already set in XML

                // Additional click logic can be added here
                // For example, change the text or perform another action
                myTextView.setText("TextView clicked!");
            }
        });
    }
}
