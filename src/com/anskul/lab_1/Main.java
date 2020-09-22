package com.anskul.lab_1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Circle circle = new Circle(8);
//        iFigure cylinder = new Cylinder(circle, 5);

        ArrayList<Circle> circles = new ArrayList<>();
        ArrayList<Cylinder> cylinders = new ArrayList<>();

        circles.add(new Circle(5));
        circles.add(new Circle(10));
        circles.add(new Circle(6));
        circles.add(new Circle(8));

        cylinders.add(new Cylinder(circles.get(0).getRadius(), 5));
        cylinders.add(new Cylinder(circles.get(1).getRadius(), 22));
        cylinders.add(new Cylinder(circles.get(2).getRadius(), 12));
        cylinders.add(new Cylinder(circles.get(3).getRadius(), 4));

        System.out.println(circles.toString().replace("[", "").replace("]", ""));
        System.out.println(cylinders.toString().replace("[", "").replace("]", ""));

        System.out.println(maxSquare(circles));
        System.out.println(averageVolume(cylinders));
    }

    public static String maxSquare(final ArrayList<Circle> circles)
    {
        double max = circles.get(0).getSquare();
        for (Circle circle : circles) {
            if (circle.getSquare() > max) {
                max = circle.getSquare();
            }
        }
        return "\nMax square of a circle: " + max;
    }

    public static String averageVolume(ArrayList<Cylinder> cylinders)
    {
        double volume = 0;
        for (Cylinder cylinder : cylinders) {
            volume += cylinder.getVolume();
        }
        volume /= cylinders.size();

        return "\nAverage volume of a cylinder = " + volume;
    }
}