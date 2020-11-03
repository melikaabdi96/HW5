package com.company;

/**
 * this class holds all shapes
 * @author Melika
 * @version 1.0
 * @since 2020
 */
public class Shape {


    public Shape(){ }

    /**
     * calculate perimeter of a shape
     * @return perimeter
     */
    public double calculatePerimeter(){
        //double perimeter;
         double perimeter = 0;
        return perimeter;
    }

    /**
     * calculate area of a shape
     * @return area
     */
    public double calculateArea(){

        double area = 0;
        return area;
    }

    /**
     * draw a circle
     */
    public void draw(){
        System.out.println("Circle");
        System.out.println("perimeter : " +calculatePerimeter());
        System.out.println("area : " + calculateArea());
    }

    @Override
    public boolean equals(Object object){
        if (this.equals(object)){
            return true;
        }else
            return false;
    }

    @Override
    public String toString(){
        String str = null;
        return str;
    }
}

