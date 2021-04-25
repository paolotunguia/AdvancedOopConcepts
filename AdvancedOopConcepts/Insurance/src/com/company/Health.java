package com.company;

public class Health extends Insurance{
    public Health() {
        super("Health Insurance");
    }

    public void setCost() {
        super.cost = 196;
    }

    public void display() {
        System.out.println("\n" + super.getType() + " (Monthly Fee) = " + super.getCost() + "$");
    }
}