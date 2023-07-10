package bai06;

public class PhongThiNghiem extends Phong {
    private String chuyenNghanh;
    private int sucChua;
    private boolean bonRua;

    public PhongThiNghiem(String ma, int day, float dienTich, int bongDen, String chuyenNghanh, int sucChua, boolean bonRua) {
        super(ma, day, dienTich, bongDen);
        this.chuyenNghanh = chuyenNghanh;
        this.sucChua = sucChua;
        this.bonRua = bonRua;
        if (super.getDienTich() / 10 >= super.getBongDen() && this.bonRua)
            super.setDatChuan(true);
    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public boolean isBonRua() {
        return bonRua;
    }

    public void setBonRua(boolean bonRua) {
        this.bonRua = bonRua;
    }
}
