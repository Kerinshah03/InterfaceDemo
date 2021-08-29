package com.company;

public class Rectangle extends AbstractRectangle{
    int sideA,sideB;
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
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
