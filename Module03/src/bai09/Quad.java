package bai09;

public class Quad extends Shape {
    @Override
    void draw() {
        System.out.println("Quad drawn");
    }

    @Override
    void erase() {
        System.out.println("Quad erased");

    }

    @Override
    void move(int x, int y) {
        System.out.println("Quad is moved to (" + x + "," + y + ")");
    }
}
