package com.company;

public class UseBook {
    public static void main(String[] args) {

        Fiction fictions = new Fiction("Divergent");
        System.out.println(fictions.toString());

        NonFiction nonfictions = new NonFiction("In the Heart of the Sea");
        System.out.println(nonfictions.toString());
    }
}