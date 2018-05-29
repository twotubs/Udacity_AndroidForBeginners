package com.example.android.tour_guide_v1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by JonG on 5/8/18.
 */

public class BarsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        //Create a list of attraction items  // dont have a location object here
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Rockpool", "Beachfront hangout with TVs and music.", "location", R.drawable.color_black));
        items.add(new Item("Strolla Bar", "Great cocktails, cosy, casual", "location", R.drawable.color_brown));
        items.add(new Item("Brian's Pub", "Bar games, Cosy, Casual.", "location", R.drawable.color_dusty_yellow));
        items.add(new Item("Stones", "Bar games, cosy, casual", "location", R.drawable.color_green));
        items.add(new Item("The Duchess of Wisbeach", "Hip cross between a New York speakeasy and a Parisian cafe, with music and a Mediterranean menu.", "location", R.drawable.color_green));
        items.add(new Item("Jerry's Burger Sea Point", "Cosy, Casual, Groups ", "location", R.drawable.color_red));
        items.add(new Item("The Lava Lounge", "Cosy, Casual, Groups.", "location", R.drawable.color_white));

        //Create a word adapter whose data source is a list of the object @list.  This adpater will createa a list item for each item in the list
        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_colors);

        //Find the object in the view hierarch of the activity.  There should be a listview with the view id called list
        //which is declared in the item_list.xml
        ListView listView = (ListView) findViewById(R.id.list);

        //Make the {@link List View} use the {@link ItemAdapter} created above, so that the {@link ListView} will display
        //the list items for each {@link item} in the list
        listView.setAdapter(adapter);
    }
}
