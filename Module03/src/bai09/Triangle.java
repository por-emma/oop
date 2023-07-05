package bai09;

public class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Triangle drawn");
    }

    @Override
    void erase() {
        System.out.println("Triangle erased");

    }

    @Override
    void move(int x, int y) {
        System.out.println("Triangle is moved to (" + x + "," + y + ")");
    }
}
