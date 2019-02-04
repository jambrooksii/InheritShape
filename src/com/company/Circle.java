package com.company;

public class Circle extends Shape{

    double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea(double radius){
        double area = (radius * radius) * Math.PI;

        return area;
    }

    public double getPermimeter(double radius){
        double permimeter = (Math.PI * 2) * radius;

        return permimeter;
    }

    @Override
    public void printShape(){
        System.out.println("The Shape color is " + color + "Is the Shape filled " + filled);
    }

}
