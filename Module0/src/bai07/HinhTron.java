package bai07;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;

	public double tinhChuVi() {
		return 3.14 * 2 * this.banKinh;
	}

	public double tinhDienTich() {
		return 3.14 * this.banKinh * this.banKinh;
	}

	public HinhTron(ToaDo tam, double banKinh) {
		this.tam = tam;
		this.banKinh = banKinh;
	}

	public HinhTron() {

	}

	public ToaDo getTam() {
		return tam;
	}

	public void setTam(ToaDo tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

}
