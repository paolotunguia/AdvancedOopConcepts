package com.company;

public class UseGeometric {
    public static void main(String[] args)
    {
        GeometricFigure[] geometricFigures = new GeometricFigure[4];
        geometricFigures[0] = new Square(2.1, 2.1, "Square");
        geometricFigures[1] = new Square(8.1, 8.1, "Square");
        geometricFigures[2] = new Triangle(4.1,6.4, "Triangle");
        geometricFigures[3] = new Triangle(10.1,12.1, "Triangle");

        for (int i = 0; i < geometricFigures.length; i++ ) {
            System.out.println(geometricFigures[i].toString());
        }
    }
}