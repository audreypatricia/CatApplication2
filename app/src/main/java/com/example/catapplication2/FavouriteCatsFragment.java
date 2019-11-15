package com.example.catapplication2;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FavouriteCatsFragment extends Fragment {

    public RecyclerView recyclerView;
    public FavAdapter favAdapter;
    public RecyclerView.LayoutManager layoutManager;

        private String favCatName;
        private String favCatOrigin;
    ArrayList<AddToFav> favList = CatDetailActivity.favCatList;

    public FavouriteCatsFragment() {
         //Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_favourite_cats, container, false);

        ArrayList<CatItem> catListFav = new ArrayList<>();

//        favCatName= this.getArguments().getString("catName");
//        favCatOrigin= this.getArguments().getString("catOrigin");
//
//        catListFav.add(new CatItem(favCatName,favCatOrigin));



//
        recyclerView = view.findViewById(R.id.rv_fav);
        layoutManager = new LinearLayoutManager(view.getContext());
        favAdapter = new FavAdapter(favList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(favAdapter);

        return view;
   }

}
