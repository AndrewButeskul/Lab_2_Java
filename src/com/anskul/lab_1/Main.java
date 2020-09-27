package com.anskul.lab_1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Circles circles = new Circles();
        Cylinders cylinders = new Cylinders();

        circles.circles.add(new Circle(5));
        circles.circles.add(new Circle(10));
        circles.circles.add(new Circle(6));
        circles.circles.add(new Circle(8));

        cylinders.cylinders.add(new Cylinder(circles.circles.get(0).getRadius(), 5));
        cylinders.cylinders.add(new Cylinder(circles.circles.get(1).getRadius(), 22));
        cylinders.cylinders.add(new Cylinder(circles.circles.get(2).getRadius(), 12));
        cylinders.cylinders.add(new Cylinder(circles.circles.get(3).getRadius(), 4));

        System.out.println(circles.circles.toString().replace("[", "").replace("]", ""));
        System.out.println(cylinders.cylinders.toString().replace("[", "").replace("]", ""));

        System.out.println(circles.maxSquare(circles.circles));
        System.out.println(cylinders.averageVolume(cylinders.cylinders));
    }

}