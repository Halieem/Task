package com.company;

public class Circle extends Shape {
    private  double radius_;
    private String colour;
    protected static double  PI = 3.14;

    Circle (double radius, int color) {
        super (color);
        radius_ = radius;
    }

    public double getArea () {
        return PI * radius_ * radius_;
    }
    public String toString() {
        if (getColor() == 1){
            colour = "Red";
        }
        if (getColor() == 2){
            colour = "Blue";
        }
        if (getColor() == 3){
            colour = "Green";
        }
        return ("\nThe radius = " + radius_
                + "\nThe Circle area: " + getArea()
                + "\nThe Circle color: " + colour);
    }
}
