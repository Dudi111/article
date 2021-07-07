package com.example.article;

public class Article {
    private int image;
    private String disp;

    public int getImage() {
        return image;
    }

    public String getDisp() {
        return disp;
    }

    public Article(int image, String disp) {
        this.image = image;
        this.disp = disp;
    }
}
