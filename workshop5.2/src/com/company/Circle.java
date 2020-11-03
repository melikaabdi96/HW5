package com.company;

/**
 * this class extends Shape class
 * @author Melika
 * @version 1.0
 * @since 2020
 */
public class Circle extends Shape{
    private double radius;

    /**
     *
     * @param radius radius of circle
     */
    public Circle(double radius){
        super();
        this.radius = radius;
    }

    //getter
    public double getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }

    @Override
    public double calculateArea(){
        double area = 3.14 * radius * radius;
        return area;
    }

    @Override
    public void draw(){

        System.out.println("Circle");
        System.out.println("perimeter : " +calculatePerimeter());
        System.out.println("area : " + calculateArea());
    }

    @Override
    public String toString(){
        String str = "raduis:" + radius ;
        return "Circle::" + str;

    }
}
