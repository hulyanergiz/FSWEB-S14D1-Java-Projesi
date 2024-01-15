package com.workintech.geometricObjects;

public class Cuboid extends Rectangle {
    private double height;

    private double checkHeight(double height){
        return height<0?0:height;
    }
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = checkHeight(height);
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
