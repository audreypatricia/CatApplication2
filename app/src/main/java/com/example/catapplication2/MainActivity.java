package com.example.catapplication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
//            private RecyclerView recyclerView;
//            private RecyclerView.Adapter adapter;
//            private RecyclerView.LayoutManager layoutManager;
//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//                ArrayList<CatItem> catList = new ArrayList<>();
//                catList.add(new CatItem(R.drawable.cat, "Bengal", "United States"));
//                catList.add(new CatItem(R.drawable.cat, "Bengal", "United States"));
//                catList.add(new CatItem(R.drawable.cat, "Bengal", "United States"));
//
//                recyclerView = findViewById(R.id.rv_search);
//                layoutManager = new LinearLayoutManager(this);
//                adapter = new CatAdapter(catList);
//                bottomNavigationView = findViewById(R.id.nav_view);
//                recyclerView.setLayoutManager(layoutManager);
//                recyclerView.setAdapter(adapter);
        bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if (menuItem.getItemId() == R.id.nav_search) {

                    Fragment fragment = new SearchRecyclerView();
                    swapFragment(fragment);



                    return true;
                } else if (menuItem.getItemId() == R.id.nav_home) {


                    return true;
                } else if (menuItem.getItemId() == R.id.nav_fav) {
                            Fragment fragment = new FavouriteCatsFragment();
                            swapFragment(fragment);


                    return true;
                }
                return false;
            }
        });

    }

    private void swapFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_slot, fragment);
        fragmentTransaction.commit();
    }
}
