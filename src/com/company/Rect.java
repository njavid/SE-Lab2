package com.company;

public class Rect extends Shape{

    private int height;
    private  int width;

    public Rect(int height,int width) {
        this.height = height;
        this.width = width;
    }

    public int getArea(){
        return this.height*this.width;
    }

    public int getWidth(){
        return 0;
    }
    public int getHeight(){
        return 0;
    }
}
