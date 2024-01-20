package com.example.finalrecyvlerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVadapter extends RecyclerView.Adapter<studentVH> {

    ArrayList<Student> list ;

    public RVadapter(ArrayList<Student> list) {
        this.list = list;
    }

    @Override
    public studentVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        studentVH v =new studentVH(view);
        return v;
    }

    @Override
    public void onBindViewHolder(@NonNull studentVH holder, int position) {
        holder.t1.setText(list.get(position).getName());
        holder.t2.setText(list.get(position).getId());
        holder.img.setImageResource(list.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
