package com.example.thamdavy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText userEdt, passEdt;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        setVariable();
    }

    private void initView() {
        userEdt = findViewById(R.id.eidtTextTextPersonName);
        passEdt = findViewById(R.id.eidtTextTextPassword);
        loginBtn = findViewById(R.id.loginBtn); // Assuming you have a button with this ID
    }

    private void setVariable() {
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userEdt.getText().toString().isEmpty() || passEdt.getText().toString().isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please fill in the login form", Toast.LENGTH_SHORT).show();
                } else if (userEdt.getText().toString().equals("Thamdavy") && passEdt.getText().toString().equals("123")) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                } else {
                    Toast.makeText(LoginActivity.this, "Incorrect username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void register(View view, View register) {
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }
}
