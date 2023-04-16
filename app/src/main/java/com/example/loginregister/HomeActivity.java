package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity extends AppCompatActivity {

    TextView getEmail,toast_text;
    TextView getPassword;

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getEmail = findViewById(R.id.email);
        getPassword = findViewById(R.id.password);
        fab = findViewById(R.id.floatingActionButton);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View v = LayoutInflater.from(getApplicationContext()).inflate(
                        R.layout.custom_toast,null,false);

                toast_text = v.findViewById(R.id.toast_text);

                toast_text.setText("Hello Ahmed");

                Toast t = new Toast(getApplicationContext());

                t.setView(v);

                t.setDuration(Toast.LENGTH_LONG);
                t.show();


                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);

            }
        });

        Intent intent = getIntent();

        getEmail.setText(intent.getStringExtra("name"));

        getPassword.setText(intent.getStringExtra("userPassword"));


    }
}