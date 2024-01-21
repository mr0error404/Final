package com.example.finalrecyvlerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;   

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView r1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1=findViewById(R.id.recyclerView);

        Student s1 = new Student("Ali" , 44,R.drawable.image5);
        Student s2 = new Student("Husam" , 34 , R.drawable.image5);
        Student s3 = new Student("Ali" , 44,R.drawable.image5);
        Student s4 = new Student("Husam" , 34 , R.drawable.image5);
        Student s5 = new Student("Ali" , 44,R.drawable.image5);
        Student s6 = new Student("Husam" , 34 , R.drawable.image5);
        Student s7 = new Student("Ali" , 44,R.drawable.image5);
        Student s8 = new Student("Husam" , 34 , R.drawable.image5);

        ArrayList<Student> arrayList = new ArrayList();

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        arrayList.add(s5);
        arrayList.add(s6);
        arrayList.add(s7);
        arrayList.add(s8);


        RVadapter v = new RVadapter(arrayList);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        r1.setLayoutManager(manager);
        r1.setAdapter(v);


    }
}