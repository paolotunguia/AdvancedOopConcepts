package com.company;

public class Square extends GeometricFigure {
    Square(double height, double width, String type) {
        super(height, width, type);
    }

    @Override
    public double figureArea() {
        return (super.getHeight() * super.getWidth());
    }

    @Override
    public String toString() {
        return "\nFigure = " + super.getType() +
               "\nHeight = " + super.getHeight() + "cm" +
               "\nWidth = " + super.getWidth() + "cm" +
               "\nArea = " + this.figureArea() + "cm\u00B2";
    }
}