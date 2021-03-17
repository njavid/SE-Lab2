package com.company;

public class Square {
    private int side;


    public Square(int side) {
        this.side = side;
    }
    public int getArea(){

        return this.side * this.side;
    }

    public int getSide(){
        return this.side;
    }

    public void setSide(int newSide){
        this.side = newSide;
    }
}
