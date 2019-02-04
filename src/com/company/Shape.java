package com.company;

public class Shape {

    String color;
    boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

   public void printShape(){
        System.out.println("Your Shape is " + color + "Is the shape filled " + filled);
    }


}
