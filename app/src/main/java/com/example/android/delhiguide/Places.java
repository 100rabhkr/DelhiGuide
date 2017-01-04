package com.example.android.delhiguide;

/**
 * Created by saurabh on 1/3/2017.
 */

public class Places {
    private String mName;
    private String mAddress;
    private int mResourceId;
    private String mMapLocation;
    public Places(String Name, String Address, int ResourceId, String MapLocation){
        mName = Name;
        mAddress = Address;
        mResourceId = ResourceId;
        mMapLocation = MapLocation;
    }

    public Places(String Name, String Address, int ResourceId)
    {
        mName = Name;
        mAddress = Address;
        mResourceId = ResourceId;
    }

    public Places(String Name, String Address){
        mName = Name;
        mAddress = Address;
        mResourceId = -1;
    }


    public String getName(){

        return mName;

    }

    public String getAddress(){

        return mAddress;

    }

    public int getResourceId(){

        return mResourceId;

    }

    public String getmMapLocation(){
        return mMapLocation;
    }

}
