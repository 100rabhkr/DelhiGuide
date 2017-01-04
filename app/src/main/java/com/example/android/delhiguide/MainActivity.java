package com.example.android.delhiguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Places = (TextView)findViewById(R.id.places);
        Places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent PlacesIntent = new Intent(MainActivity.this, PlacesActivity.class);
                // Start the new activity
                startActivity(PlacesIntent);
            }
        });

        TextView food = (TextView)findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FoodActivity}
                Intent foodIntent = new Intent(MainActivity.this, Main2Activity.class);
                // Start the new activity
                startActivity(foodIntent);
            }
        });

        TextView shop = (TextView)findViewById(R.id.shopping);
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FoodActivity}
                Intent shopIntent = new Intent(MainActivity.this, ShoppingActivity.class);
                // Start the new activity
                startActivity(shopIntent);
            }
        });
        TextView top = (TextView)findViewById(R.id.top7places);
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FoodActivity}
                Intent shopIntent = new Intent(MainActivity.this, Selection.class);
                // Start the new activity
                startActivity(shopIntent);
            }
        });






    }



}
