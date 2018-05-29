package com.example.android.tour_guide_v1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by JonG on 5/8/18.
 */

public class AttractionsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        //Create a list of attraction items  // dont have a location object here
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Putt Putt", "A round of miniature golf. You can choose between playing two different courses. Each course consists of 18 holes of varying difficulty", "location", R.drawable.color_black));
        items.add(new Item("Beachfront Promenade", "he walk is refreshing and the views are great.", "location", R.drawable.color_brown));
        items.add(new Item("Blue Train", "Have a little trip on Cape Town’s only miniature train with a view of the sea, passing ships and Robben Island.", "location", R.drawable.color_dusty_yellow));
        items.add(new Item("V&A Waterfront", "A very nice shopping center in a great location", "location", R.drawable.color_green));
        items.add(new Item("Two Oceans Aquarium", "Without doubt one of the most exciting attractions in the city with a wonderful child play area in the basement set right up against the seal display where children and seals have fun alongside one another", "location", R.drawable.color_green));
        items.add(new Item("Harbor Seal Cruise", "ook out for Alfie the Seal on this scenic guided harbour cruise through the working Harbour – see seals, ships and much, much more. ", "location", R.drawable.color_red));
        items.add(new Item("World of Birds", "ts the largest bird park in Africa and one of the few large bird parks in the World. Over 3,000 birds and small animals are presented in over 100 landscaped, walk through aviaries.", "location", R.drawable.color_white));

        //Create a word adapter whose data source is a list of the object @list.  This adpater will createa a list item for each item in the list
        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_colors);

        //Find the object in the view hierarch of the activity.  There should be a listview with the view id called list
        //which is declared in the item_list.xml
        ListView listView = (ListView) findViewById(R.id.list);

        //Make the {@link List View} use the {@link ItemAdapter} created above, so that the {@link ListView} will display
        //the list items for each {@link item} in the list
        listView.setAdapter(adapter);

        //Set a click listener to to pull GPS whenever the item is clicked.
    }
    }

