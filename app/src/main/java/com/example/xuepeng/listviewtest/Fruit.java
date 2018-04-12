package com.example.xuepeng.listviewtest;

/**
 * Created by xuepeng on 18/4/12.
 */

public class Fruit {
    private  String name;

    private int imageId;

    public Fruit(String name,int imageId){
        this.imageId=imageId;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

}
