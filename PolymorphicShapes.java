package com.scratchy;

import java.util.ArrayList;
import java.util.List;

public class PolymorphicShapes {
    public static void main(String[] args){
        List<Shape> bucket = new ArrayList<>();
        bucket.add(new Square(12));        
        bucket.add(new Rectangle(14, 6));
        bucket.add(new Circle(8));

        for(Shape shape: bucket){
            System.out.println(shape.area());
        }
    }
}

interface Shape {
    double area();
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }
}

class Circle implements Shape {
    private double radius;
    public final double PI = 3.141592653589793;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }
}