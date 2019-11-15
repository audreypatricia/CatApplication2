package com.example.catapplication2;


import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchRecyclerView extends Fragment {

    public RecyclerView recyclerView;
    public CatAdapter adapter;
    public RecyclerView.LayoutManager layoutManager;

    public SearchRecyclerView() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_search_recycler_view, container, false);

        setHasOptionsMenu(true);

        ArrayList<Cat> catList = new ArrayList<>();


        catList.add(new Cat("Abyssinian","Egypt","7  -  10","Active, Energetic, Independent, Intelligent, Gentle","14 - 15","https://en.wikipedia.org/wiki/Abyssinian_(cat)","The Abyssinian is easy to care for, and a joy to have in your home. They’re affectionate cats and love both people and other animals.",4));
        catList.add(new Cat("Aegean","Greece","7 - 10","Affectionate, Social, Intelligent, Playful, Active","9 - 12","https://en.wikipedia.org/wiki/Aegean_cat", "Native to the Greek islands known as the Cyclades in the Aegean Sea, these are natural cats, meaning they developed without humans getting involved in their breeding. As a breed, Aegean Cats are rare, although they are numerous on their home islands. They are generally friendly toward people and can be excellent cats for families with children.",4));
        catList.add(new Cat("American Bobtail","United States","7 - 16","Intelligent, Interactive, Lively, Playful, Sensitive", "11 - 15","https://en.wikipedia.org/wiki/American_Bobtail","American Bobtails are loving and incredibly intelligent cats possessing a distinctive wild appearance. They are extremely interactive cats that bond with their human family with great devotion.",5));
        catList.add(new Cat("Balinese","United States","4 - 10","Affectionate, Intelligent, Playful","10 - 15", "https://en.wikipedia.org/wiki/Balinese_(cat)", "Balinese are curious, outgoing, intelligent cats with excellent communication skills. They are known for their chatty personalities and are always eager to tell you their views on life, love, and what you’ve served them for dinner. ",5));
        catList.add(new Cat("Bambino", "United States", "4 - 9","Affectionate, Lively, Friendly, Intelligent","12 - 14","https://en.wikipedia.org/wiki/Bambino_cat","The Bambino is a breed of cat that was created as a cross between the Sphynx and the Munchkin breeds. The Bambino cat has short legs, large upright ears, and is usually hairless. They love to be handled and cuddled up on the laps of their family members.",5));
        catList.add(new Cat("Bengal", "United States", "6 - 12", "Alert, Agile, Energetic, Demanding, Intelligent", "12 - 15", "https://en.wikipedia.org/wiki/Bengal_(cat)", "Bengals are a lot of fun to live with, but they're definitely not the cat for everyone, or for first-time cat owners. Extremely intelligent, curious and active, they demand a lot of interaction and woe betide the owner who doesn't provide it.",5));
        catList.add(new Cat("Chantilly-Tiffany", "US", "7 - 12", "Affectionate, Demanding, Interactive, Loyal","14 - 16","https://en.wikipedia.org/wiki/Chantilly-Tiffany","The Chantilly is a devoted companion and prefers company to being left alone. While the Chantilly is not demanding, she will \"chirp\" and \"talk\" as if having a conversation. This breed is affectionate, with a sweet temperament. It can stay still for extended periods, happily lounging in the lap of its loved one. This quality makes the Tiffany an ideal traveling companion, and an ideal house companion for senior citizens and the physically handicapped.",5));
        catList.add(new Cat("Chartreux","France","6 - 15","Affectionate, Loyal, Intelligent, Social, Lively, Playful","12 - 15","https://en.wikipedia.org/wiki/Chartreux","The Chartreux is generally silent but communicative. Short play sessions, mixed with naps and meals are their perfect day. Whilst appreciating any attention you give them, they are not demanding, content instead to follow you around devotedly, sleep on your bed and snuggle with you if you’re not feeling well.",5));
        catList.add(new Cat("Cheetoh", "United States","8 - 15", "Affectionate, Gentle, Intelligent, Social","12 - 14","https://en.wikipedia.org/wiki/Bengal_cat#Cheetoh","The Cheetoh has a super affectionate nature and real love for their human companions; they are intelligent with the ability to learn quickly. You can expect that a Cheetoh will be a fun-loving kitty who enjoys playing, running, and jumping through every room in your house.",5));
        catList.add(new Cat("Devon Rex",  "United Kingdom","5 - 10","Highly interactive, Mischievous, Loyal, Social, Playful","10 - 15", "https://en.wikipedia.org/wiki/Devon_Rex","The favourite perch of the Devon Rex is right at head level, on the shoulder of her favorite person. She takes a lively interest in everything that is going on and refuses to be left out of any activity. Count on her to stay as close to you as possible, occasionally communicating his opinions in a quiet voice. She loves people and welcomes the attentions of friends and family alike.",5));
        catList.add(new Cat("Donskoy", "Russian", "10 - 12","Playful, affectionate, loyal, social","12 - 15","https://en.wikipedia.org/wiki/Donskoy_(cat)","Donskoy are affectionate, intelligent, and easy-going. They demand lots of attention and interaction. The Donskoy also gets along well with other pets. It is now thought the same gene that causes degrees of hairlessness in the Donskoy also causes alterations in cat personality, making them calmer the less hair they have.",3));
        catList.add(new Cat("Dragon Li","China","9 - 12","Intelligent, Friendly, Gentle, Loving, Loyal","12 - 15","https://en.wikipedia.org/wiki/Egyptian_Mau","The Egyptian Mau is gentle and reserved. She loves her people and desires attention and affection from them but is wary of others. Early, continuing socialization is essential with this sensitive and sometimes shy cat, especially if you plan to show or travel with her. Otherwise, she can be easily startled by unexpected noises or events.",3));

        recyclerView = view.findViewById(R.id.rv_search);
        layoutManager = new LinearLayoutManager(view.getContext());
        adapter = new CatAdapter(catList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return view;

        //        final CatAdapter catAdapter = new CatAdapter(catList);
//        final RequestQueue requestQueue =  Volley.newRequestQueue(getActivity());
//
//        String url = "https://api.thecatapi.com/v1/breeds";
//
//        //make an array
//        //then just list
//
//        Response.Listener<String> responseListener = new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                Gson gson = new Gson();
//
//                Cat[] catResponse = gson.fromJson(response, Cat[].class);
//
//
//
//                for(int i=0; i< catResponse.length; i++){
//                 catList.add(catResponse[i]);
//                }
//
//
////                recyclerView.setAdapter(catAdapter);
////                System.out.println(cResponse.size());
////                requestQueue.stop();
//            }
//        };
//
//
//        Response.ErrorListener errorListener = new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(getContext(),"The request failed: " + error.getMessage(), Toast.LENGTH_SHORT).show();
//                requestQueue.stop();
//            }
//        };
//
//        recyclerView.setAdapter(catAdapter);
//        final StringRequest stringRequest;
//
//
//        stringRequest = new StringRequest(Request.Method.GET, url, responseListener, errorListener) {
//
//
//        };
//
//
//
//        requestQueue.add(stringRequest);


        //I tried using this to get the JSON data, but it kept saying i got nothing back

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.search_menu, menu);
        super.onCreateOptionsMenu(menu,inflater);

        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
//        return true;
    }


}
