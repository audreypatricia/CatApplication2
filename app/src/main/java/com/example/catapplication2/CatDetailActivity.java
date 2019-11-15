package com.example.catapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CatDetailActivity extends AppCompatActivity {

    private TextView catName;
    private TextView catOrigin;
    private TextView catLifeSpan;
    private TextView catDesc;
    private TextView catTemperament;
    private TextView catUrl;
    private TextView dogFriendlinessLevel;
    private ImageView addToFav;
    private TextView catWeight;
    public  static ArrayList<AddToFav> favCatList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_detail);

        Intent intent = getIntent();
        final Cat catItem = (Cat) intent.getSerializableExtra("catObject");

        catName = findViewById(R.id.tv_catName);
        catOrigin = findViewById(R.id.tv_catOrigin);
        catLifeSpan = findViewById(R.id.tv_lifeSpan);
        catDesc = findViewById(R.id.tv_description);
        catTemperament = findViewById(R.id.tv_temperament);
        catUrl = findViewById(R.id.tv_url);
        dogFriendlinessLevel = findViewById(R.id.tv_dogFriendlinessLevel);
        catWeight = findViewById(R.id.tv_weight);
        addToFav = findViewById(R.id.addToFav);

        catName.setText(catItem.getName());
        catOrigin.setText(catItem.getOrigin());
        catLifeSpan.setText(catItem.getLife_span());
        catDesc.setText(catItem.getDescription());
        catTemperament.setText(catItem.getTemperament());
        catUrl.setText(catItem.getWikipedia_url());
        catWeight.setText(catItem.getWeight());
      //  dogFriendlinessLevel.setText(catItem.getDog_friendly_level());

        addToFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    favCatList.add(new AddToFav(catItem.getName(), catItem.getOrigin()));

                Toast.makeText(getApplicationContext(), "this cat has been added to favourites!", Toast.LENGTH_LONG).show();
            }
// need to send it to Fav Adapter
        });



    }


}