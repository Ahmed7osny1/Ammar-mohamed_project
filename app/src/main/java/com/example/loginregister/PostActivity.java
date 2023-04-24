package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.loginregister.Adapter.PostAdapter;
import com.example.loginregister.model.post_model;

import java.util.ArrayList;

public class PostActivity extends AppCompatActivity {

    ListView list_post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        list_post = findViewById(R.id.list_post);

        ArrayList<post_model> model = new ArrayList<>();

        model.add(
                new post_model(
                R.drawable.login,
                "Ahmed Hosny",
                "This is first post",
                R.drawable.register)
        );

        model.add(
                new post_model(
                        R.drawable.register,
                        "Ammar",
                        "This is second post",
                        R.drawable.login)
        );

        model.add(
                new post_model(
                        R.drawable.login,
                        "mohamed",
                        "This is third post",
                        R.drawable.register)
        );


        PostAdapter adapter = new PostAdapter(R.layout.post_layout, model,
                getApplicationContext());

        list_post.setAdapter(adapter);

        list_post.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(),
                        PostDescriptionActivity.class);

                intent.putExtra("post", model.get(i));

                startActivity(intent);
            }
        });

    }
}