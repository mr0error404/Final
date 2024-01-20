package com.example.finalrecyvlerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class studentVH extends RecyclerView.ViewHolder{

    ImageView img;
    TextView t1,t2;
    public studentVH(@NonNull View itemView) {
        super(itemView);

        img=itemView.findViewById(R.id.imageView);
        t1=itemView.findViewById(R.id.textView);
        t2=itemView.findViewById(R.id.textView2);




    }
}
