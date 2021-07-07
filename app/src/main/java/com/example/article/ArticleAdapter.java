package com.example.article;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleHolder> {
     ArrayList<Article> articlelist;

     public ArticleAdapter(ArrayList<Article> articlelist){
         this.articlelist=articlelist;
     }


    @NonNull

    @Override
    public ArticleHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.article_layout,parent,false);
        return new ArticleHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  ArticleHolder holder, int position) {
         Article article=articlelist.get(position);
         holder.setarticle(article);

    }

    @Override
    public int getItemCount() {
        return articlelist.size();
    }
}
