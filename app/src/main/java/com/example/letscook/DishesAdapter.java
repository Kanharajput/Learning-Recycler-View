package com.example.letscook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DishesAdapter extends RecyclerView.Adapter<DishesAdapter.DishesHolder> {

    private String[] mdishes_name;
    private String[] mdishes_discription;
    private LayoutInflater mlayoutInflator;

    public DishesAdapter(Context context, String[] mdishes_name, String[] mdishes_discription) {
        mlayoutInflator = LayoutInflater.from(context);
        this.mdishes_name = mdishes_name;
        this.mdishes_discription = mdishes_discription;
    }

    @NonNull
    @Override
    public DishesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mlayoutInflator.inflate(R.layout.dishes_home_layout,parent,false);
        return new DishesHolder(itemView) ;
    }

    @Override
    public void onBindViewHolder(@NonNull DishesHolder holder, int position) {
        String ds_name = mdishes_name[position];
        String ds_discription = mdishes_discription[position];
        holder.dish_name.setText(ds_name);
        holder.dish_discription.setText(ds_discription);
    }

    @Override
    public int getItemCount() {
        return mdishes_name.length;
    }

    public class DishesHolder extends RecyclerView.ViewHolder {

        public TextView dish_discription;
        public TextView dish_name;

        public DishesHolder(@NonNull View itemView) {
            super(itemView);

            dish_name = itemView.findViewById(R.id.dish_name);
            dish_discription = itemView.findViewById(R.id.dish_disciption);
        }
    }
}
