package com.workintech.model;

public class Cylinder extends Circle{
    private double height;

    private double checkHeight(double height){
        return height<0?0:height;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = checkHeight(height);
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }

}
