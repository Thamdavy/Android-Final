package com.example.thamdavy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText userEdt, passEdt, confirmPassEdt;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
        setVariable();
    }

    private void initView() {
        userEdt = findViewById(R.id.eidtTextTextPersonName);
        passEdt = findViewById(R.id.editText);
        confirmPassEdt = findViewById(R.id.eidtTextTextPassword);
        registerBtn = findViewById(R.id.loginBtn); // Assuming you have a button with this ID
    }

    private void setVariable() {
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userEdt.getText().toString();
                String password = passEdt.getText().toString();
                String confirmPassword = confirmPassEdt.getText().toString();

                if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(confirmPassword)) {
                    Toast.makeText(RegisterActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                } else {
                    // Here you would normally save the user data to a database
                    Toast.makeText(RegisterActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                }
            }
        });
    }

    public void Login(View view) {
    }
}
