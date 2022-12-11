abstract class Shape {
    void numberOfSides() {
    }
}

class Rectangle extends Shape {

    void numberOfSides() {
        System.out.println("Rectangle has 4 sides");
    }

}

class Triangle extends Shape {

    void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }

}

class Circle extends Shape {

    void numberOfSides() {
        System.out.println("Circle has no sides");
    }

}

public class ShapesDemo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        circle.numberOfSides();
        triangle.numberOfSides();
        rectangle.numberOfSides();
    }
}
