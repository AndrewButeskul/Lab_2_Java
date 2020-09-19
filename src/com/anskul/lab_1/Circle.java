package com.anskul.lab_1;

public class Circle implements iFigure {

    private double radius;
    private double length;
    private double square;

    public Circle(double radius) {
        setRadius(radius);
        this.length = this.get_Length();
        this.square = this.get_Square();
    }

    public Circle() {
    }

    @Override
    public String toString() {
        return "\nCircle\nRadius: " + radius + "\nLenght: " + get_Length() + "\nSquare: " + get_Square() + "\n";
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0)
            this.radius = radius;
        else
            this.radius = 1;
    }

    @Override
    public double get_Square() {
        return Math.round(Math.PI*(Math.pow(radius,2)));
    }

    public double get_Length() {
        return this.length = Math.round(2 * Math.PI * radius);
    }

    public void setLength(double length) {
        this.length = get_Length();
    }

    public void setSquare(double square) {
        this.square = get_Square();
    }

}
