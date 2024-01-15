package com.workintech.model;

public class Rectangle {
    private double width;
    private double length;

    private double checkSide(double side){
        return side<0?0:side;
    }

    public Rectangle(double width, double length) {
        this.width = checkSide(width);
        this.length = checkSide(length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return width*length;
    }
}
