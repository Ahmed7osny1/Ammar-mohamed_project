package com.example.loginregister.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.loginregister.R;
import com.example.loginregister.model.post_model;

import java.util.ArrayList;

public class PostAdapter extends BaseAdapter {

    int resource;
    ArrayList<post_model> model;
    Context context;

    public PostAdapter(int resource, ArrayList<post_model> model, Context context){
        this.context = context;
        this.model = model;
        this.resource = resource;
    }


    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public Object getItem(int i) {
        return model.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v = view;
        if(v == null){
            v = LayoutInflater.from(context).inflate(resource,null,false);
        }

        ImageView user_img = v.findViewById(R.id.user_img);
        TextView post_user = v.findViewById(R.id.post_user);
        TextView post_desc = v.findViewById(R.id.post_desc);
        ImageView post_img = v.findViewById(R.id.post_img);

        user_img.setImageResource(model.get(position).getUser_img());
        post_desc.setText(model.get(position).getPost_desc());
        post_user.setText(model.get(position).getUser_name());
        post_img.setImageResource(model.get(position).getPost_img());

        return v;
    }
}
