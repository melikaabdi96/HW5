package com.company;

import java.util.ArrayList;

/**
 * this class extends Shape class
 * @author Melika
 * @version 1.0
 * @since 2020
 */
public class Polygon extends Shape {
    private ArrayList<Double> sides;

    /**
     *
     * @param sides input sides of a rectangle or triangle
     */
    public Polygon(double... sides){
        super();
        this.sides = new ArrayList<>();
        for (double side : sides){
            this.sides.add(side);
        }
    }

    //getter
    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public String toString(){
        if (sides.size() == 3) {
            String str = "side1:" + sides.get(0) + "," + "side2:" + sides.get(1) + "," + "side3:" + sides.get(2);
            return str;
        }else{String str = "side1:" + sides.get(0) + "," + "side2:" + sides.get(1) + "," + "side3:" + sides.get(2) + "," + "side4:" + sides.get(3);
            return str;
        }

    }
}
