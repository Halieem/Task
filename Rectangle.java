package com.company;

public class Rectangle  extends Shape {
    private double length_, width_;
    private String colour;

    Rectangle (double length, double width, int color) {
        super (color);
        length_ = length;
        width_  = width;
    }

    public double getArea () {
        return length_ * width_;
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
        return ("\nLength of Rectangle = " + length_
                + "\nwidth of Rectangle = " + width_
                + "\nThe Area of Rectangle = " + getArea()
                + "\n Rectangle color: " + colour);
    }
}
