package com.company;

public class Square extends Shape {
    private double length_;
    private String colour;
    Square (double len, int color) {
        super(color);
        length_ = len;
    }
    public double getArea() {
        return length_ * length_;
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
        return ("\nThe Square area: " + getArea()
                + "\nLength of Square = " + length_
                + "\nSquare color: " + colour);
    }
}
