package com.shonen.ukr.testformyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

/**
 * Class do describe how looks information about dish in activity
 * Extend ArrayAdapter
 */
public class DishAdapter extends ArrayAdapter<Dish> {
    public DishAdapter(@NonNull Context context, @NonNull List<Dish> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }
        Dish customDish = getItem(position);
        TextView customDishName = listItem.findViewById(R.id.dish_name_txt_view);
        customDishName.setText(customDish.getDishName());
        TextView customDishTotalWeight = listItem.findViewById(R.id.total_weight_txt_view);
        customDishTotalWeight.setText(String.valueOf(customDish.getDishWeight()));
        TextView customDishTotalCalories = listItem.findViewById(R.id.total_calories_txt_view);
        customDishTotalCalories.setText(String.valueOf(customDish.getTotalCalories()));
        return listItem;
    }
}
