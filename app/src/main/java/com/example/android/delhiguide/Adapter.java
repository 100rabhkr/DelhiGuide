package com.example.android.delhiguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by saurabh on 1/3/2017.
 */

public class Adapter extends ArrayAdapter<Places> {

    public Adapter(Activity Context, ArrayList<Places> place){
        super(Context,0, place);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Places currentPosition = getItem(position);
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_default, parent, false);
        }

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.NameTextView);
        TextView AddressTextView = (TextView)listItemView.findViewById(R.id.AddressTextView);
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image1);

        nameTextView.setText(currentPosition.getName());
        AddressTextView.setText(currentPosition.getAddress());

        if (currentPosition.getResourceId()!= -1) {

            imageView.setImageResource(currentPosition.getResourceId());
        }

        else {

            imageView.setVisibility(View.INVISIBLE);

        }

        return listItemView;


    }
}
