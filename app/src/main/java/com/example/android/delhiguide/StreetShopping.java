package com.example.android.delhiguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class StreetShopping extends Fragment {

    public StreetShopping() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myFragmentView = inflater.inflate(R.layout.fragment_street_shopping, container, false);

        String [] PlaceName = new String[5];
        PlaceName[0] = getString(R.string.StreetMarket1);
        PlaceName[1] = getString(R.string.StreetMarket2);
        PlaceName[2] = getString(R.string.StreetMarket3);
        PlaceName[3] = getString(R.string.StreetMarket4);
        PlaceName[4] = getString(R.string.StreetMarket5);

        String [] PlaceAdd = new String[5];
        PlaceAdd[0]= getString(R.string.AStreetMarket1);
        PlaceAdd[1]= getString(R.string.AStreetMarket2);
        PlaceAdd[2]= getString(R.string.AStreetMarket3);
        PlaceAdd[3]= getString(R.string.AStreetMarket4);
        PlaceAdd[4]= getString(R.string.AStreetMarket5);

        int[] MonumentImages = new int[5];
        MonumentImages[0] = R.drawable.streetmarket1;
        MonumentImages[1] = R.drawable.streetmarket2;
        MonumentImages[2] = R.drawable.streetmarket3;
        MonumentImages[3] = R.drawable.streetmarket4;
        MonumentImages[4] = R.drawable.streetmarket5;

        String[] MapLocations = new String[5];
        MapLocations[0] = getString(R.string.mapStreetMarket1);
        MapLocations[1] = getString(R.string.mapStreetMarket2);
        MapLocations[2] = getString(R.string.mapStreetMarket3);
        MapLocations[3] = getString(R.string.mapStreetMarket4);
        MapLocations[4] = getString(R.string.mapStreetMarket5);


        final ArrayList<Places> placesArrayList = new ArrayList<Places>();
        for(int i = 0; i<5; i++){
            placesArrayList.add(new Places(PlaceName[i],PlaceAdd[i],MonumentImages[i],MapLocations[i]));
        }

        Adapter adapter = new Adapter(getActivity(),placesArrayList);
        ListView listView = (ListView) myFragmentView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Places places = placesArrayList.get(position);
                String mapString = places.getmMapLocation();
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse(mapString));

                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    getActivity().startActivity(intent);
                }


            }
        });

        return myFragmentView;
    }

}
