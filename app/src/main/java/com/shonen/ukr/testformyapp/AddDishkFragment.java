package com.shonen.ukr.testformyapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddDishkFragment extends Fragment  {
    private EditText nameFood, weightFood, calories;
    private Button addBtn, cancelBtn;
    public AddDishkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.adding_menu,container,false);

        nameFood = rootView.findViewById(R.id.name_food);
        weightFood = rootView.findViewById(R.id.weight);
        calories = rootView.findViewById(R.id.calories);
        addBtn = rootView.findViewById(R.id.addBtn);
        cancelBtn = rootView.findViewById(R.id.cncl_btn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Dish dish = new Dish(nameFood.getText().toString(), Double.parseDouble(weightFood.getText().toString()), Double.parseDouble(calories.getText().toString()));
                    Intent intent = new Intent(getContext(), FoodsMenu.class);
                    intent.putExtra(Dish.class.getSimpleName(), dish);
                    startActivity(intent);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        return rootView;
    }

}
