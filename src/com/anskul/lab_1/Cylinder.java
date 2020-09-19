package com.anskul.lab_1;

public class Cylinder extends Circle {

    private double radius;
    private double height;
    private double square;
    private double volume;

    public Cylinder(Circle circle, double height) {
        this.radius = circle.getRadius();
        setHeight(height);
        this.square = 0;
        this.volume = 0;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "\nCylinder\nRadius: " + radius + "\nHeight: " + height + "\nSquare: " + get_Square()
                + "\nVolume: " + get_Volume() + "\n";
    }

    @Override
    public double get_Square() {
        return Math.round(2*Math.PI*radius*(height+radius));
    }

    public double get_Volume(){
        return Math.round(Math.PI*Math.pow(radius,2)*height);
    }

    public void setHeight(double height) {
        if(height > 0)
            this.height = height;
        else
            this.height = 1;
    }
}
