package com.example.android.delhiguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        String [] PlaceName = new String[7];
        PlaceName[0] = getString(R.string.StreetMarket1);
        PlaceName[1] = getString(R.string.Market2);
        PlaceName[2] = getString(R.string.streetfood3);
        PlaceName[3] = getString(R.string.monument1);
        PlaceName[4] = getString(R.string.club5);
        PlaceName[5] = getString(R.string.StreetMarket3);
        PlaceName[6] = getString(R.string.Market1);


        String [] PlaceAdd = new String[7];
        PlaceAdd[0]= getString(R.string.AStreetMarket1);
        PlaceAdd[1]= getString(R.string.AMarket2);
        PlaceAdd[2]= getString(R.string.Astreetfood3);
        PlaceAdd[3]= getString(R.string.Amonument1);
        PlaceAdd[4]= getString(R.string.Aclub5);
        PlaceAdd[5]= getString(R.string.AStreetMarket3);
        PlaceAdd[6]= getString(R.string.AMarket1);

        int[] MonumentImages = new int[7];
        MonumentImages[0] = R.drawable.streetmarket1;
        MonumentImages[1] = R.drawable.market2;
        MonumentImages[2] = R.drawable.streetfood3;
        MonumentImages[3] = R.drawable.qutb_minar;
        MonumentImages[4] = R.drawable.club5;
        MonumentImages[5] = R.drawable.streetmarket3;
        MonumentImages[6] = R.drawable.market1;

        String[] MapLocations = new String[7];
        MapLocations[0] = getString(R.string.mapStreetMarket1);
        MapLocations[1] = getString(R.string.mapMarket2);
        MapLocations[2] = getString(R.string.mapstreetfood3);
        MapLocations[3] = getString(R.string.mapmonument1);
        MapLocations[4] = getString(R.string.mapclub5);
        MapLocations[5] = getString(R.string.mapStreetMarket5);
        MapLocations[6] = getString(R.string.mapMarket1);

        final ArrayList<Places> placesArrayList = new ArrayList<Places>();
        for(int i = 0; i<7; i++){
            placesArrayList.add(new Places(PlaceName[i],PlaceAdd[i],MonumentImages[i],MapLocations[i]));
        }

        Adapter adapter = new Adapter(this,placesArrayList);
        ListView listView = (ListView) findViewById(R.id.activity_selection);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Places places = placesArrayList.get(position);
                String mapString = places.getmMapLocation();
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse(mapString));

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }


            }
        });


    }
}
