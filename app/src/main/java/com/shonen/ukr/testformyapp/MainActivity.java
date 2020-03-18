package com.shonen.ukr.testformyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * TextView add menu use to activate Menu
         */
        TextView showMenu = findViewById(R.id.show_menus);
        showMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showMenu = new Intent(MainActivity.this, Menu.class);
                startActivity(showMenu);
            }
        });
        final TextView addMenu = findViewById(R.id.adding_new_menu);
        addMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addDish = new Intent(MainActivity.this, AddDish.class);
                startActivity(addDish);
            }
        });

    }
}
