package com.example.loginregister.enterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.loginregister.HomeActivity;
import com.example.loginregister.R;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText userEmail, userPassword;
    TextView forget;
    Button login;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userEmail = findViewById(R.id.email_edt);
        userPassword = findViewById(R.id.password_edt);
        forget = findViewById(R.id.forget_text);
        login = findViewById(R.id.login_btn);

        login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    intent = new Intent(getApplicationContext(),
                            HomeActivity.class);

                    intent.putExtra("userEmail",
                            userEmail.getText().toString());

                    intent.putExtra("userPassword",
                            userPassword.getText().toString());

                    startActivity(intent);
                    finish();
                }
            }
        );


    }
}