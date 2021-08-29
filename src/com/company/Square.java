package com.company;

public class Square implements Shape{

    int sideA,sideB;

    public Square(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int calculateArea(int sideA, int sideB) {
        return sideA * sideB;
    }

    @Override
    public String printShapeDetails() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
