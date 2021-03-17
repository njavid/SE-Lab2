package com.company;

public class Square {
    private int side;


    public Square(int side) {
        this.side = side;
    }
    public int getArea(){

        return this.side * this.side;
    }
}
