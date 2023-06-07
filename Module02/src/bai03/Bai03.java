package bai03;

public class Bai03 {
	private int ma, mb, mc;

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		if (ma > 0)
			this.ma = ma;
	}

	public int getMb() {
		return mb;
	}

	public void setMb(int mb) {
		if (mb > 0)
			this.mb = mb;
	}

	public int getMc() {
		return mc;
	}

	public void setMc(int mc) {
		if (mc > 0)
			this.mc = mc;
	}

	public Bai03(int ma, int mb, int mc) {
		if (ma > 0 && mb > 0 && mc > 0 && ma + mb > mc && mb + mc > ma && ma + mc > mb) {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		} else {
			this.ma = 0;
			this.mb = 0;
			this.mc = 0;
		}
	}

	public Bai03() {
		this.ma = 0;
		this.mb = 0;
		this.mc = 0;
	}

	public int tinhCV() {
		return this.ma + this.mb + this.mc;
	}

	public float tinhDT() {
		float p = (this.ma + this.mb + this.mc) / 2;
		float x = (float) Math.sqrt(p * (p - this.ma) * (p - this.mb) * (p - this.mc));
		return (float) Math.sqrt(p * (p - this.ma) * (p - this.mb) * (p - this.mc));
	}

	public String type() {
		if (ma + mb > mc && mb + mc > ma && ma + mc > mb)
			if (this.ma == this.mb && this.ma == this.mc)
				return "Tam giac deu";
			else if (this.ma == this.mb || this.ma == this.mc)
				return "Tam giac can";
			else
				return "Tam giac thuong";
		else
			return "Khong phai tam giac";
	}

	@Override
	public String toString() {
		return "\nCanh ma: " + this.ma + "\nCanh mb: " + this.mb + "\nCanh mc: " + this.mc + "\nKieu tam giac: "
				+ this.type() + "\nChu vi: " + this.tinhCV() + "\nDien tich: " + this.tinhDT();
	}

}
