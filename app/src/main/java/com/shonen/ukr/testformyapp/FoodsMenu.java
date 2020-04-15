package com.shonen.ukr.testformyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FoodsMenu extends AppCompatActivity {

    private ArrayList<Dish> dishMenu = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        dishMenu.add(new Dish("Рис", 125.5, 50.4));
        dishMenu.add(new Dish("соль", 15, 5.4));

        final DishAdapter dishAdapter = new DishAdapter(FoodsMenu.this, dishMenu);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(dishAdapter);

        try {
            Bundle arguments = getIntent().getExtras();
            final Dish dish;
            dish = (Dish) arguments.getSerializable(Dish.class.getSimpleName());
            dishAdapter.add(new Dish(dish.getDishName(),dish.getDishWeight(),dish.getCalories()));
            dishAdapter.notifyDataSetChanged();

        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

}
