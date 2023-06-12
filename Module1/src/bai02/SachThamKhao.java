package bai02;

import java.time.LocalDate;

public class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao(String maSach, String nhaXuatBan, double donGia, int soLuong, LocalDate ngayNhap, double thue) {
        super(maSach, nhaXuatBan, donGia, soLuong, ngayNhap);
        this.thue = thue;
    }

    public SachThamKhao() {
        super();
        this.thue = 0;
    }

    public double getThanhTien() {
        return super.getThanhTien() * (1 + this.thue);
    }

    @Override
    public String toString() {
        return "SachThamKhao{" +
                "thue=" + thue +
                '}';
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }
}
