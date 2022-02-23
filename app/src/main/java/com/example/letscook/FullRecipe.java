package com.example.letscook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FullRecipe extends AppCompatActivity {

    private TextView recipeView;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_recipe);

        recipeView  = findViewById(R.id.dish_recipe);
        imageView = findViewById(R.id.dish_image);
        Intent intent = getIntent();
        String clicked_dish_name = intent.getStringExtra(MainActivity.MainExtra);
        String full_recipe = getResources().getString(getResources().getIdentifier(clicked_dish_name+"_recipe","string",getPackageName()));
        Drawable image = getResources().getDrawable(getResources().getIdentifier(clicked_dish_name,"drawable",getPackageName()));
        recipeView.setText(full_recipe);
        imageView.setImageDrawable(image);
    }
}