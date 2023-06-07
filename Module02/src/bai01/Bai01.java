package bai01;

public class Bai01 {
	private int x, y;
	private String ten;

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

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Bai01(int x, int y, String ten) {
		this.x = x;
		this.y = y;
		this.ten = ten;
	}

	public Bai01() {
		this.x = 0;
		this.y = 0;
		this.ten = null;
	}

	@Override
	public String toString() {
		return this.ten + "(" + this.x + "," + this.y + ")";
	}

}
