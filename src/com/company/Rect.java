package com.company;

public class Rect {

    private int height;
    private  int width;

    public Rect(int height,int width) {
        this.height = height;
        this.width = width;
    }

    public int getArea(){
        return this.height*this.width;
    }
}
