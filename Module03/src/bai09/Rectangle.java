package bai09;

public class Rectangle extends Quad {
    @Override
    void draw() {
        System.out.println("Rectangle drawn");
    }

    @Override
    void erase() {
        System.out.println("Rectangle erased");

    }

    @Override
    void move(int x, int y) {
        System.out.println("Rectangle is moved to (" + x + "," + y + ")");
    }
}
