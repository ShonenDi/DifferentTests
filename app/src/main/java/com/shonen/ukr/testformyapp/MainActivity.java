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
        TextView addMenu = findViewById(R.id.show_menus);
        addMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addMenu = new Intent(MainActivity.this,Menu.class);
                startActivity(addMenu);
            }
        });


    }
}
