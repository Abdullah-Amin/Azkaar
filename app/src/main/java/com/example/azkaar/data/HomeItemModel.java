package com.example.azkaar.data;

import android.graphics.Bitmap;

public class HomeItemModel {
    private String itemText;
    private Integer itemImage;

    public HomeItemModel(String itemText, Integer itemImage) {
        this.itemText = itemText;
        this.itemImage = itemImage;
    }

    public String getItemText() {
        return itemText;
    }

    public void setItemText(String itemText) {
        this.itemText = itemText;
    }

    public Integer getItemImage() {
        return itemImage;
    }

    public void setItemImage(Integer itemImage) {
        this.itemImage = itemImage;
    }
}
