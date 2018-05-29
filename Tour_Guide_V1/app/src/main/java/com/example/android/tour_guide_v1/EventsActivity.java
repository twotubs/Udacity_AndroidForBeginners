package com.example.android.tour_guide_v1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by JonG on 5/8/18.
 */

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        //Create a list of attraction items  // dont have a location object here
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Cape Town Art Fair", "V&A Waterfront will again be abuzz with art enthusiasts and those with a keen eye for all things aesthetically intriguing", "location", R.drawable.color_black));
        items.add(new Item("Cape Town Carnival", "The annual Cape Town Carnival ignites the Mother City at the Fan Walk, Somerset Road in Green Point.", "location", R.drawable.color_brown));
        items.add(new Item("Cape Town Cycle Tour", "The Cape Town Cycle Tour is the largest timed cycling event in the world.", "location", R.drawable.color_dusty_yellow));
        items.add(new Item("Cape Town Festival of Beer", "the Cape Town Festival of Beer has erupted into the Southern Hemisphere’s biggest beer festival", "location", R.drawable.color_green));
        items.add(new Item("Cape Town Pride Festival", "The ever increasing success of Pride in Cape Town draws many visitors to the city.", "location", R.drawable.color_green));
        items.add(new Item("Festival of Chariots", "The Festival of Chariots is an amazing East-meets-West cultural experience and everyone is welcome.  ", "location", R.drawable.color_red));
        items.add(new Item("Two Oceans Marathon", "The Old Mutual Two Oceans Marathon is run under the rules of IAAF, Athletics South Africa and Western Province Athletics.", "location", R.drawable.color_white));

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
