package com.company;

public class Life extends Insurance{
    public Life() {
        super("Life Insurance");
    }

    public void setCost() {
        super.cost = 36;
    }

    public void display() {
        System.out.println("\n" + super.getType() + " (Monthly Fee) = "+ super.getCost() + "$");
    }
}