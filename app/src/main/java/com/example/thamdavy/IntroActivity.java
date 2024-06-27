package com.example.thamdavy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IntroActivity extends AppCompatActivity {

    private ImageView goBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        initview();
        setVarible();
    }
    private void initview(){
        goBtn = findViewById(R.id.goBtn);
    }
    private void setVarible(){
        goBtn.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this,LoginActivity.class)));
    }
}