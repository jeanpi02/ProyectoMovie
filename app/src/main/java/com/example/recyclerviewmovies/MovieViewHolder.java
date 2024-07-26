package com.example.recyclerviewmovies;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieViewHolder extends RecyclerView.ViewHolder {

    TextView nameView;
    TextView descView;
    ImageView imageView;


    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);

        nameView = itemView.findViewById(R.id.titleView);
        descView = itemView.findViewById(R.id.descView);
        imageView = itemView.findViewById(R.id.imageView);

    }
}
