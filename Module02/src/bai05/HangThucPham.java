package bai05;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class HangThucPham {
	private String ma, ten;
	private float gia;
	private LocalDate nsx, hsd;

	public String getMa() {
		return ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		if (ten != null)
			this.ten = ten;
		else
			this.ten = "xxx";
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		if (gia >= 0)
			this.gia = gia;
	}

	public LocalDate getNsx() {
		return nsx;
	}

	public void setNsx(LocalDate nsx) {
		if (nsx.isBefore(LocalDate.now()))
			this.nsx = nsx;
		else
			this.nsx = LocalDate.now();
	}

	public LocalDate getHsd() {
		return hsd;
	}

	public void setHsd(LocalDate hsd) {
		if (hsd.isAfter(this.nsx))
			this.hsd = hsd;
		else
			this.hsd = this.nsx;
	}

	public HangThucPham(String ma, String ten, float gia, LocalDate nsx, LocalDate hsd) throws Exception {
		if (ma != null)
			this.ma = ma;
		else
			throw new Exception("Lỗi: Mã hàng rỗng!");
		setTen(ten);
		setGia(gia);
		setNsx(nsx);
		setHsd(hsd);
	}

	public HangThucPham(String ma) throws Exception {
		if (ma != null)
			this.ma = ma;
		else
			throw new Exception("Lỗi: Mã hàng rỗng!");
	}

	public String checkHsd() {
		if (hsd.isBefore(LocalDate.now()))
			return "Hàng hết hạn";
		else
			return "";
	}

	@Override
	public String toString() {
		DecimalFormat fm = new DecimalFormat("###,###.00VND");
		return String.format("%-10s %-10s %15s %-20s %-20s %-15s", this.ma, this.ten, fm.format(this.gia),
				nsx.toString(), hsd.toString(), this.checkHsd());

	}

}
