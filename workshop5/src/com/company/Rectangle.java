package com.company;

import java.util.ArrayList;
/**
 * this class holds rectangle's information
 * @author Melika
 * @version 1.0
 * @since 2020
 */
public class Rectangle {
    private ArrayList<Double> sides;


    public Rectangle(double side1, double side2, double side3, double side4){
        this.sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);


    }

    //getter
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * check if the rectangle is a squere
     * @return
     */
    public boolean isSquere(){
        for (int x = 1; x < sides.size(); x++) {
            if (sides.get(0) == sides.get(x)){
               return true;
            }
        }
        return false;
    }

    //calculate Perimeter
    public double calculatePerimeter(ArrayList<Double> sides){
        double perimeter = sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3);
        return perimeter;
    }

    //calculate Area
    public double calculateArea(ArrayList<Double> sides){
        double area = sides.get(0) * sides.get(1);
        return area;
    }

    /**
     * draw a rectangle
     * @param sides
     */
    public void draw(ArrayList<Double> sides){
        System.out.println("Rectangle");
        System.out.println("perimeter : " + calculatePerimeter(sides));
        System.out.println("area : " + calculateArea(sides));
    }

    @Override
    public boolean equals(Object object){
        if (this.equals(object)) {
            return true;
        }else
            return false;

    }

    @Override
    public String toString(){
        String str = "Triangle" + " - " + "side1 : "  + sides.get(0) + " - " + "side2 : "  + sides.get(1) + " - " + "side3 : "  + sides.get(2) + " - " + "side4 : "  + sides.get(3) ;
        return str;

    }
}
