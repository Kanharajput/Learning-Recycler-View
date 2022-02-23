package com.example.letscook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private String dishes_name[];
    private String dishes_description[];
    private RecyclerView recyclerView;
    private DishesAdapter mDishesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get teh name and description
        dishes_name = getResources().getStringArray(R.array.dishes_name);
        dishes_description = getResources().getStringArray(R.array.dishes_description);
        recyclerView = findViewById(R.id.recycler_view);
        mDishesAdapter = new DishesAdapter(this,dishes_name,dishes_description);
        recyclerView.setAdapter(mDishesAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}