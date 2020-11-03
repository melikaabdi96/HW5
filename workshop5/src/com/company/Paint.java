package com.company;

import java.util.ArrayList;
/**
 * this class holds all shapes
 * @author Melika
 * @version 1.0
 * @since 2020
 */
public class Paint {
    private ArrayList<Circle> circles;
    private ArrayList<Triangle> triangles;
    private ArrayList<Rectangle> rectangles;


    public Paint(){
        this.circles = new ArrayList<>();
        this.triangles = new ArrayList<>();
        this.rectangles = new ArrayList<>();
    }

    /**
     * add a new triangle
     * @param triangle
     */
    public void addTriangle(Triangle triangle){
        triangles.add(triangle);
    }

    /**
     * add a new rectangle
     * @param rectangle
     */
    public void addRectagle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    /**
     * add a new circle
     * @param circle
     */
    public void addCircle(Circle circle){
        circles.add(circle);
    }

    /**
     * draw all shapes
     */
    public void drawAll(){
        for (Circle circle : circles){
            circle.draw(circle.getRadius());
        }
        for (Triangle triangle : triangles){
            triangle.draw();
        }
        for (Rectangle rectangle : rectangles){
            rectangle.draw(rectangle.getSides());
        }
    }

    /**
     * print all shapes
     */
    public void printAll(){
        for (Circle circle : circles) {
            System.out.println(circle.toString());
        }
        for (Triangle triangle : triangles){
               System.out.println(triangle.toString());
            }
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle.toString());
        }

    }

}
