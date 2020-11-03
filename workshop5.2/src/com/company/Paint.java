package com.company;

import java.util.ArrayList;

/**
 * this class print and draw shapes
 * @author Melika
 * @version 1.0
 * @since 2020
 */
public class Paint {
    private ArrayList<Shape> shapes;

    public Paint(){
        this.shapes = new ArrayList<>();
    }

    /**
     * add a new shape
     * @param shape
     */
    public void addShape(Shape shape){
        shapes.add(shape);
    }

    /**
     * draw a all shapes
     */
    public void drawAll(){
        for (Shape shape : shapes){
            shape.draw();
        }
    }

    /**
     * print all informations of shapes
     */
    public void printAll(){
        for (Shape shape : shapes){
           System.out.println(shape.toString());
        }
    }
}
