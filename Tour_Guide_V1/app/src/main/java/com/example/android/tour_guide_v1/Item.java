package com.example.android.tour_guide_v1;

/**
 * Created by JonG on 5/9/18.
 *
 * This class represents an item in the list.  This will be a restaurant, place, event.  It contains a w
 */

public class Item {

    //Default name for the item/
    private String mItem;

    //Some information about that item/
    private String mInfo;

    private String mLocationResourceId;

    //An image resource ID for the item
    private int mImageResourceId;

    //Constant value that represents no image was provided for this word
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Item object
     *
     * @param item               is the name of the item in the list.
     * @param info               is some information about the item in the list
     * @param locationResourceId is the loaction resource ID for the item
     * @param imageResourceId    is the drawable resource ID for the image associated with this word
     */


    public Item(String item, String info, String locationResourceId, int imageResourceId) {
        mItem = item;
        mInfo = info;
        mLocationResourceId = locationResourceId;
        mImageResourceId = imageResourceId;
    }

        //Get the item

    public String getItem() {
        return mItem;
    }

    //Get the info on the item
    public String getInfo() {
        return mInfo;
    }

    //get the location resource id
    public String getLocationResourceId() {
        return mLocationResourceId;
    }

    //get the image resource ID of the item
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Returns whether or not there is an image for this word
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}

