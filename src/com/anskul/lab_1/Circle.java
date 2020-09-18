package com.anskul.lab_1;

public class Circle implements iFigure {

    private double radius;
    private double length;
    private double square;

    public Circle(double radius, double length, double square) {
        this.radius = radius;
        this.length = length;
        this.square = square;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public double get_radius() {
        return 0;
    }
}
