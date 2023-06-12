package bai03;

import java.time.LocalDate;

public class GiaoDich {
    private String ma;
    private LocalDate ngay;
    private int gia, sl;

    public GiaoDich(String ma, LocalDate ngay, int gia, int sl) {
        this.ma = ma;
        this.ngay = ngay;
        this.gia = gia;
        this.sl = sl;
    }

    public int thanhTien() {
        return sl * gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public LocalDate getNgay() {
        return ngay;
    }

    public void setNgay(LocalDate ngay) {
        this.ngay = ngay;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
}
