package com.example.nutritionapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<Food> foodArrayList;

    public MyAdapter(Context context, ArrayList<Food> foodArrayList) {
        this.context = context;
        this.foodArrayList = foodArrayList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Food food = foodArrayList.get(position);

        holder.name.setText(food.getName());
        holder.description.setText(food.getDescription());
        holder.protein.setText(Double.toString(food.getProtein()));
        holder.carbohydrate.setText(Double.toString(food.getCarbohydrate()));
        holder.fat.setText(Double.toString(food.getFat()));


    }

    @Override
    public int getItemCount() {
        return foodArrayList.size();
    }

    public  static  class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name,description,fat,protein,carbohydrate;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);
            fat = itemView.findViewById(R.id.fat);
            protein = itemView.findViewById(R.id.protein);
            carbohydrate = itemView.findViewById(R.id.carbohydrate);
        }
    }
}
