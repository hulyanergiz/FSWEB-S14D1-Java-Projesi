package com.workintech.model;

public class Circle {
    private double radius;

    private double checkRadius(double radius){
        return radius<0?0:radius;
    }
    public Circle(double radius) {
        this.radius = checkRadius(radius);
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
