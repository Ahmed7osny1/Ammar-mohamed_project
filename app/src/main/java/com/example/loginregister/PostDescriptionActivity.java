package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.loginregister.model.post_model;

public class PostDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_description);

        ImageView user_img = findViewById(R.id.user_img);
        TextView post_user = findViewById(R.id.post_user);
        TextView post_desc = findViewById(R.id.post_desc);
        ImageView post_img = findViewById(R.id.post_img);

        Intent intent = getIntent();

        post_model p = (post_model) intent.getSerializableExtra("post");

        user_img.setImageResource(p.getUser_img());
        post_desc.setText(p.getPost_desc());
        post_user.setText(p.getUser_name());
        post_img.setImageResource(p.getPost_img());

    }
}