package com.company;

public abstract class Insurance {
    public abstract void setCost();
    public abstract void display();

    private String type;
    double cost;

    public Insurance(String insurance) {
        this.type = insurance;
    }

    public String getType() {
        return this.type;
    }

    public double getCost() {
        return this.cost;
    }
}