package bai07;

public class ToaDo {
	private String ten;
	private float x, y;

	@Override
	public String toString() {
		return "Hinh tron co tam " + this.ten + "(" + this.x + "," + this.y + ")";
	}

	public ToaDo() {
		this.x = 0;
		this.y = 0;
	}

	public ToaDo(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
