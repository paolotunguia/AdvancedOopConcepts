package com.company;

public abstract class GeometricFigure {
    public abstract double figureArea();

    private double height;
    private double width;
    private String type;

    GeometricFigure(double height, double width, String type) {
        this.height = height;
        this.width = width;
        this.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}