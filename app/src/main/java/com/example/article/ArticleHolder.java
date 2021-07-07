package com.example.article;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleHolder extends RecyclerView.ViewHolder {
    private ImageView ivimage;
    private TextView tvtext;



    public ArticleHolder(@NonNull  View itemView) {
        super(itemView);
        initial(itemView);
    }

    private void initial(View itemView){
        ivimage=itemView.findViewById(R.id.ivimage);
        tvtext=itemView.findViewById(R.id.tvtext);
    }
    public void setarticle(Article article){
        ivimage.setBackgroundResource(article.getImage());
        tvtext.setText(article.getDisp());
    }
}
