package com.company;

import java.util.ArrayList;

/**
 * this class extends Polygon class
 * @author Melika
 * @version 1.0
 * @since 2020
 */
public class Triangle extends Polygon {


    public Triangle(double... sides){
        super(sides);
    }

    /**
     * check if the triangle is equilateral or not
     * @return true if it is and not if it's not
     */
    public boolean isEquilateral(){
        if (super.getSides().get(0) == super.getSides().get(1) && super.getSides().get(1) == super.getSides().get(2) && super.getSides().get(0) == super.getSides().get(2)){
            return true;
        }else
            return false;
    }

    @Override
    public double calculatePerimeter(){
        double perimeter = super.getSides().get(0) + super.getSides().get(1) + super.getSides().get(2);
        return perimeter;
    }

    @Override
    public double calculateArea(){
        double area = (super.getSides().get(0) * super.getSides().get(0) - (super.getSides().get(2) * super.getSides().get(2)) / 4) * (super.getSides().get(2) / 2);
        return area;
    }

    public void draw(){
        System.out.println("Triangle");
        System.out.println("perimeter : " + calculatePerimeter());
        System.out.println("area : " + calculateArea());
    }

    @Override
    public String toString(){
        System.out.print("Triangle::");
        for (int x = 0; x < super.getSides().size(); x++) {
            return super.toString();
        }
        return null;
    }

}
