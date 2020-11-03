package com.company;

import java.util.ArrayList;

/**
 * this class holds Triangle's information
 * @author Melika
 * @version 1.0
 * @since 2020
 */
public class Triangle {
    private ArrayList<Double> sides;


    public Triangle(double side1, double side2, double side3){
        this.sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
    }

    //getter
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * check if the triangle is Equilateral
     * @return
     */
    public boolean isEquilateral(){
        if (sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2) && sides.get(0) == sides.get(2)){
            return true;
        }else
            return false;
    }

    //calculate Perimeter
    public double calculatePerimeter(ArrayList<Double> sides){
        double perimeter = sides.get(0) + sides.get(1) + sides.get(2);
        return perimeter;
    }

    //calculate Area
    public double calculateArea(ArrayList<Double> sides){
        double area = (sides.get(0) * sides.get(0) - (sides.get(2) * sides.get(2)) / 4) * (sides.get(2) / 2);
        return area;
    }

    /**
     * draw a triangle
     */
    public void draw(){
        System.out.println("Triangle");
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
        String str = "Triangle" + " - " + "side1 : " + sides.get(0) + " - " + "side2 :" + sides.get(1) + " - " + "side3 :" + sides.get(2);
        return str;

    }
}
