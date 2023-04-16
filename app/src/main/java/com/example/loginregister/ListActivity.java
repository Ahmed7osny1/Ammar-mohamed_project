package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.loginregister.Adapter.MyAdapter;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView lt;

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lt = findViewById(R.id.listView);

        ArrayList<String> names = new ArrayList<>();

        names.add("Ahmed");
        names.add("Ammar");
        names.add("mohamed");
        names.add("Ahmed");
        names.add("Ammar");
        names.add("mohamed");
        names.add("Ahmed");
        names.add("Ammar");
        names.add("mohamed");
        names.add("Ahmed");
        names.add("Ammar");
        names.add("mohamed");
        names.add("Ahmed");
        names.add("Ammar");
        names.add("mohamed");
        names.add("Ahmed");
        names.add("Ammar");
        names.add("mohamed");

        /*
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1,names);
         */


        adapter = new MyAdapter(this, android.R.layout.simple_list_item_1,names);

       lt.setAdapter(adapter);

       lt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               String name = adapter.getItem(i);
               Toast.makeText(ListActivity.this, name, Toast.LENGTH_SHORT).show();

               /*

               Intent intent = new Intent(getApplicationContext(),HomeActivity.class);

               intent.putExtra("name",name);
               startActivity(intent);

                */
           }
       });

    }
}