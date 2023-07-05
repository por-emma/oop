package bai09;

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle drawn");
    }

    @Override
    void erase() {
        System.out.println("Circle erased");

    }

    @Override
    void move(int x, int y) {
        System.out.println("Circle is moved to (" + x + "," + y + ")");
    }
}
