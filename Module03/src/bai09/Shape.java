package bai09;

public abstract class Shape {
    private int x, y;

    abstract void draw();

    abstract void erase();

    abstract void move(int x, int y);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
