package com.company;

import java.util.ArrayList;

/**
 * this class extends Polygon class
 * @author Melika
 * @version 1.0
 * @since 2020
 */
public class Rectangle extends Polygon {

    public Rectangle(double... sides){
        super(sides);

    }

    /**
     * check if the rectangle is a squere or not
     * @return true if it is and false if it's not
     */
    public boolean isSquere(){
        for (int x = 1; x < super.getSides().size(); x++) {
            if (super.getSides().get(0) == super.getSides().get(x)){
                return true;
            }
        }
        return false;
    }
    @Override
    public double calculatePerimeter(){
        double perimeter = super.getSides().get(0) + super.getSides().get(1) + super.getSides().get(2) + super.getSides().get(3);
        return perimeter;
    }
    @Override
    public double calculateArea(){
        double area = super.getSides().get(0) * super.getSides().get(1);
        return area;
    }

    @Override
    public void draw(){
        System.out.println("Rectangle");
        System.out.println("perimeter : " + calculatePerimeter());
        System.out.println("area : " + calculateArea());
    }
    @Override
    public String toString(){
        System.out.print("Rectangle::");
        for (int x = 0; x < super.getSides().size(); x++) {
            return super.toString();
        }
        return null;
    }

}

