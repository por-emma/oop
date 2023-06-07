package bai04;

public class Vehicle {
	private String chu, loai;
	private int gia, dungTich;
	private float thue;

	public String getChu() {
		return chu;
	}

	public void setChu(String chu) {
		this.chu = chu;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		if (gia >= 0)
			this.gia = gia;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		if (dungTich >= 0)
			this.dungTich = dungTich;
	}

	public float getThue() {
		return thue;
	}

	private void tinhThue() {
		if (this.dungTich < 100)
			this.thue = (float) (this.gia * 0.01);
		else if (this.dungTich < 200)
			this.thue = (float) (this.gia * 0.03);
		else
			this.thue = (float) (this.gia * 0.05);
	}

	public Vehicle(String chu, String loai, int gia, int dungTich) {
		this.chu = chu;
		this.loai = loai;
		this.gia = gia;
		this.dungTich = dungTich;
		tinhThue();
	}

	public Vehicle() {
		this.chu = null;
		this.loai = null;
		this.gia = 0;
		this.dungTich = 0;
	}

	@Override
	public String toString() {
		return String.format("%-20s %-15s %10d %15d %20.2f", this.chu, this.loai, this.dungTich, this.gia, this.thue);
	}

}
