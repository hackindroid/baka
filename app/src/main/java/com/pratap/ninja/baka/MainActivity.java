package com.pratap.ninja.baka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.pratap.ninja.baka.Activities.AdvertisementActivity;
import com.pratap.ninja.baka.Activities.FirstYearNotesActivity;
import com.pratap.ninja.baka.Activities.ResourceActivity;

public class MainActivity extends AppCompatActivity {


    ImageView iv_resources, iv_adv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_adv = findViewById(R.id.main_advertisement);
        iv_resources = findViewById(R.id.main_resources);


        iv_resources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ResourceActivity.class));
            }
        });

        iv_adv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AdvertisementActivity.class));
            }
        });

    }
}
