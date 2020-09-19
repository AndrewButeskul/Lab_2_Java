package com.anskul.lab_1;

import javax.crypto.Cipher;
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

        cylinders.add(new Cylinder(circles.get(0), 5));
        cylinders.add(new Cylinder(circles.get(1), 22));
        cylinders.add(new Cylinder(circles.get(2), 12));
        cylinders.add(new Cylinder(circles.get(3), 4));

        System.out.println(circles.toString());
        System.out.println(cylinders.toString());

        System.out.println(max_square(circles));
        System.out.println(average_volume(cylinders));
    }

    public static String max_square(ArrayList<Circle> circles){
        double max = 0;
        for (int i = 0; i < circles.size(); i++) {
            if(circles.get(i).get_Square() > max){
                max = circles.get(i).get_Square();
            }
        }
        return "\nMax square of a circle: " + max;
    }

    public static String average_volume(ArrayList<Cylinder> cylinders){
        double average_volume = 0;
        for (int i = 0; i < cylinders.size(); i++) {
            average_volume += cylinders.get(i).get_Volume();
        }
        average_volume /= cylinders.size();

        return "\nAverage volume of a cylinder = " + average_volume;
    }
    

}
