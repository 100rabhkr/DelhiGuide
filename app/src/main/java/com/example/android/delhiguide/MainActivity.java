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




    }



}
