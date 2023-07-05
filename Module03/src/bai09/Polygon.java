package bai09;

public class Polygon extends Shape {
    @Override
    void draw() {
        System.out.println("Polygon drawn");
    }

    @Override
    void erase() {
        System.out.println("Polygon erased");

    }

    @Override
    void move(int x, int y) {
        System.out.println("Polygon is moved to (" + x + "," + y + ")");
    }
}
