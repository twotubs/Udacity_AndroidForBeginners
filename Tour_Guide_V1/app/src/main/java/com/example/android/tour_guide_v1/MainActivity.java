package com.example.android.tour_guide_v1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //Find the view that shows the Attractions category
        TextView attractions = (TextView) findViewById(R.id.attractions);

        //Set a click listener on that View
        attractions.setOnClickListener(new View.OnClickListener() {
            //The code here is executed when the user clicks on the numbers category
            @Override
            public void onClick(View view){
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);

                //Start the activity
                startActivity(attractionsIntent);
            }
        });

        //Find the view that shows the Bars category
        TextView bars = (TextView) findViewById(R.id.bars);

        //Set a click listener on that View
        bars.setOnClickListener(new View.OnClickListener() {
            //The code here is executed when the user clicks on the numbers category
            @Override
            public void onClick(View view){
                Intent barsIntent = new Intent(MainActivity.this, BarsActivity.class);

                //Start the activity
                startActivity(barsIntent);
            }
        });

        //Find the view that shows the Bars category
        TextView events = (TextView) findViewById(R.id.events);

        //Set a click listener on that View
        events.setOnClickListener(new View.OnClickListener() {
            //The code here is executed when the user clicks on the numbers category
            @Override
            public void onClick(View view){
                Intent eventsIntent = new Intent(MainActivity.this, EventsActivity.class);

                //Start the activity
                startActivity(eventsIntent);
            }
        });

        //Find the view that shows the Bars category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        //Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            //The code here is executed when the user clicks on the numbers category
            @Override
            public void onClick(View view){
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantActivity.class);

                //Start the activity
                startActivity(restaurantsIntent);
            }
        });
    }
}
