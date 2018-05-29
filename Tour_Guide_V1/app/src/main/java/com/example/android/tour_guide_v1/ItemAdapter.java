package com.example.android.tour_guide_v1;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JonG on 5/10/18.
 */

public class ItemAdapter extends ArrayAdapter<Item>{
    /**Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link ItemAdapter} object
     */
    public ItemAdapter(Context context, ArrayList<Item> items, int colorResourceId) {
        super(context, 0, items);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }
        //Get the {@link Item} object located at this position in the list
        Item currentItem = getItem(position);

        //Find the TextView in the item_list.xml layout with the ID item_name
        TextView itemNameTextView = (TextView) listItemView.findViewById(R.id.item_name);
        //Get the item name from the currentItem object and set this text on the TextView
        itemNameTextView.setText(currentItem.getItem());

        //Find the TextView in the item_list.xml layout with the ID item_name
        TextView itemDescriptionTextView = (TextView) listItemView.findViewById(R.id.item_description);
        //Get the item name from the currentItem object and set this text on the TextView
        itemDescriptionTextView.setText(currentItem.getInfo());

        //Find the imageView in the item_list.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        //Check if an image is provided or not
        if (currentItem.hasImage()) {
            //if image is available, display the provided image based on resource Id
            imageView.setImageResource(currentItem.getImageResourceId());
            //Make sure it is visible
            imageView.setVisibility(View.GONE);
        }

        //set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //set the background color of the text container view
        textContainer.setBackgroundColor(color);

        //Return the whole list item layout (containing 2 text views ) so that it can be shown in the listView
        return listItemView;
    }
}
