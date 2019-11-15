package com.example.catapplication2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.ViewHolder> implements Filterable {
    public ArrayList<Cat> catList;

    public ArrayList<Cat> catListFull;

    public ArrayList<AddToFav> addToFav = new ArrayList<>();

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView catImage;
        public TextView catName;
        public TextView catOrigin;
//        public ImageView addToFav;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            catImage = itemView.findViewById(R.id.catImage);
            catName = itemView.findViewById(R.id.tv_catName);
            catOrigin = itemView.findViewById(R.id.tv_catOrigin);
//            addToFav = itemView.findViewById(R.id.addToFav);

        }
    }

    public CatAdapter(ArrayList<Cat> catList) {
        this.catList = catList;
        catListFull = new ArrayList<>(catList);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_item, parent, false);
        ViewHolder viewHolder =  new ViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {


                final Cat currentItem = catList.get(position);
//        holder.catImage.setImageResource(currentItem.getImageResource());
        holder.catName.setText(currentItem.getName());
        holder.catOrigin.setText(currentItem.getOrigin());

                holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, CatDetailActivity.class);
                intent.putExtra("catObject", currentItem);
                context.startActivity(intent);
            }
        });


        }

    @Override
    public int getItemCount() {

        return catList.size();
    }

    @Override
    public Filter getFilter() {
        return catFilter;
    }

    private Filter catFilter = new Filter() {
        @Override
        public FilterResults performFiltering(CharSequence constraint) {
//          // list only contains filtered items // UNCOMMENT TO USE FOR FAKE CATS
            List<Cat> filteredList = new ArrayList<>();

            if(constraint == null|| constraint.length()==0){

                filteredList.addAll(catListFull);

            } else {
                String filteredPattern  = constraint.toString().toLowerCase().trim();



                for(Cat catItem : catListFull){
                    if(catItem.getName().toLowerCase().contains(filteredPattern)){
                        filteredList.add(catItem);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults results) {


            catList.clear();
            catList.addAll((List)results.values);
        }
    };
}

