package practice.PTA_11_08;

import java.util.Scanner;

class Square {

    private double side;

    public Square() {
        side = 1.0;
    }

    public Square(double side) {

        this.side = side;
    }

    public double getSide() {

        return side;

    }

    public void
    setSide(double side) {

        this.side = side;
    }

    public double getArea() {

        return side * side;

    }

    public String toString() {

        return "Square: side=" + side + "area=" + getArea();

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        Square s = new Square(x);
        System.out.println(s.toString());
    }
}