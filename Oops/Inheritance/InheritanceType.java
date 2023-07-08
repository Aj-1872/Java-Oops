package Oops.Inheritance;


class Shape {

    public void displayArea(String name) {
        System.out.println("Display" + name + " area");
    }
}

class Triangle extends Shape {
    public void calculateArea(int base, int height) {
        double area = 0.5 * base * height;
        System.out.println("Triangle area: " + area);
    }
}

class Circle extends Shape {
    public void calculateArea(int radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area: " + area);
    }
}

// Multilevel inheritance
class EquilateralTriangle extends Triangle {
    public void calculateArea(int sideLength) {
        double area = (Math.sqrt(3) / 4) * sideLength * sideLength;
        System.out.println("Equilateral triangle area: " + area);
    }
}

public class InheritanceType {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.displayArea("Triangle");
        triangle.calculateArea(5, 4);

        Circle circle = new Circle();
        circle.displayArea("circle");
        circle.calculateArea(3);

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        equilateralTriangle.displayArea("equilateralTriangle");
        equilateralTriangle.calculateArea(6);

    }
}
