package com.samit;

import javax.swing.plaf.basic.BasicTreeUI;
import java.awt.*;

// Multiple Hierarchy
public class TwoDShape {
    private double width;
    private double height;

    // default constructor
    TwoDShape() {
        width = height = 0.0;
    }

    // parameterized constructor
    TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // construct object
    TwoDShape(double x) {
        width = height = x;
    }

    // accessor methods to access private attributes.
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDim() {
        System.out.println("Width and height : " + width + " and " + height);
    }
}

// Extend TwoDShape (inheritance)

class Triangle extends TwoDShape {
    private String style;

    Triangle(String style) {
        super();
        style = "none";
    }

    Triangle(String s, double width, double height) {
        super(width, height);
        style = s;
    }

    // one arugment constructor
    Triangle(double x) {
        super(x); // superclass constructor
        style = "filled";
    }

    double are() {
        return (getHeight() / 2) * getWidth();
    }

    void showStyle() {
        System.out.println("Triangle is : " + style);
    }
}

// Extend Triangle (multi-level inheritance)
class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(String color, String s, double width, double height) {
        super(s, width, height);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Color is : " + color);
    }
}

class Shapes {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Red", "filled", 2.0, 2.0);
        System.out.println("Info for t1 :");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area : " + t1.are());
        System.out.println();
        System.out.println("Info for t2 :");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area : " + t2.are());
    }
}




