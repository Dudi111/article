package com.example.article;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycle;
    private ArrayList<Article> articlelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        artticlelist();
        setRecyclerView();
    }

    private void init(){
        recycle=findViewById(R.id.recycler);
    }

    private void artticlelist(){
        articlelist=new ArrayList<>();
        Article article1=new Article(R.drawable.art2,"When you saturate yourself in the world of eating disorder recovery, you own recovery begins to feel more within reach.");
        articlelist.add(article1);
        Article article2=new Article(R.drawable.artt3,"But the reality is, food cannot determine a person’s character, will, or disposition. ");
        articlelist.add(article2);
        Article article3=new Article(R.drawable.art4,"Weight restoration and normalized eating is a part of it, but recovery goes so much deeper than that.");
        articlelist.add(article3);
        Article article4=new Article(R.drawable.art5,"The World’s Most Mind-Blowing Natural Phenomena: Catatumbo Lightning");
        articlelist.add(article4);
        Article article5=new Article(R.drawable.art6,"Think like a wise man but communicate in the language of people ");
        articlelist.add(article5);
    }
    private void setRecyclerView(){
        ArticleAdapter articleAdapter=new ArticleAdapter(articlelist);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recycle.setLayoutManager(linearLayoutManager);
        recycle.setAdapter(articleAdapter);

    }
}