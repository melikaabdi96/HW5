package com.company;

/**
 * this class holds circle's information
 * @author Melika
 * @version 1.0
 * @since 2020
 */
public class Circle {
    private double radius;

    /**
     *
     * @param radius
     */
    public Circle(double radius){
        this.radius = radius;
    }

    //getter
    public double getRadius() {
        return radius;
    }

    /**
     * calculate Perimeter
     * @param radius
     * @return perimeter
     */
    public double calculatePerimeter(double radius){
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }

    /**
     * calculateArea
     * @param radius
     * @return area
     */
    public double calculateArea(double radius){
        double area = 3.14 * radius * radius;
        return area;
    }

    /**
     * draw circle
     * @param radius
     */
    public void draw(double radius){

        System.out.println("Circle");
        System.out.println("perimeter : " +calculatePerimeter(radius));
        System.out.println("area : " + calculateArea(radius));
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
        String str = "Circle" + " - " + "radius : " + getRadius();
        return str;

    }

}
