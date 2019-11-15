package com.example.catapplication2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FavAdapter extends RecyclerView.Adapter<FavAdapter.ViewHolder> {

    public ArrayList<Cat> catListFav;

    ArrayList<AddToFav> favList ;

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView catImageFav;
        public TextView catNameFav;
        public TextView catOriginFav;
        public ImageView delete;
//        public ImageView removeFav;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            catImageFav = itemView.findViewById(R.id.tv_imageOfCat);
            catNameFav = itemView.findViewById(R.id.tv_nameOfCat);
            catOriginFav = itemView.findViewById(R.id.tv_originOfCat);
            delete = itemView.findViewById(R.id.delete);
//            removeFav = itemView.findViewById(R.id.deleteFav);
        }


    }

    public FavAdapter(ArrayList<AddToFav> favList) {
        this.favList = favList;
    }


    @NonNull
    @Override
    public FavAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fav_item, parent, false);
        FavAdapter.ViewHolder viewHolder =  new FavAdapter.ViewHolder(v);
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final AddToFav currentItem = favList.get(position);
//        holder.catImageFav.setImageResource(currentItem.getImageResource());
        holder.catNameFav.setText(currentItem.getCatNameFav());
        holder.catOriginFav.setText(currentItem.getCatOriginFav());

        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                favList.remove(position);

            }
        });

    }

    @Override
    public int getItemCount() {
        return favList.size();
    }

}
