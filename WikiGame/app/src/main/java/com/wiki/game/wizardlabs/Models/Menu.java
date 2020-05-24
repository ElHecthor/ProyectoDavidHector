package com.wiki.game.wizardlabs.Models;

public class Menu {
    private int imgUrl;
    private String Title;

    public Menu(int imgUrl, String title) {
        this.imgUrl = imgUrl;
        Title = title;
    }

    public int getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(int imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
