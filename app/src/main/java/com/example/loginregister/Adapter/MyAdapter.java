package com.example.loginregister.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> data;

    int resource;

    public MyAdapter(Context context,int resource, ArrayList<String> data){
        this.context = context;
        this.data = data;
        this.resource = resource;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public String getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;

        if(v == null){
            v = LayoutInflater.from(context).inflate(resource,
                    null,false);
        }

        TextView tv = v.findViewById(android.R.id.text1);
        String name = data.get(i);

        tv.setText(name);

        return v;
    }
}
