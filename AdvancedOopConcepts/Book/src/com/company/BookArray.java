package com.company;

public class BookArray {
    public static void main(String[] args) {

        Book[] bookArrays = new Book[10];
        bookArrays[0] = new Fiction("Divergent");
        bookArrays[1] = new Fiction("The Exorcist");
        bookArrays[2] = new Fiction("I Am Legend");
        bookArrays[3] = new Fiction("Edge of Tomorrow");
        bookArrays[4] = new Fiction("Planet of the Apes");

        bookArrays[5] = new NonFiction("In the Heart of the Sea");
        bookArrays[6] = new NonFiction("The Perfect Storm");
        bookArrays[7] = new NonFiction("Schindler's Drama");
        bookArrays[8] = new NonFiction("The Wolf of Wall Street");
        bookArrays[9] = new NonFiction("Lincoln");

        for (int i = 0; i < bookArrays.length; i++) {
            System.out.println(bookArrays[i].toString());
        }
    }
}