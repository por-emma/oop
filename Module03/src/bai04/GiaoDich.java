package bai04;

import java.time.LocalDate;

public class GiaoDich {
    private String ma;
    private LocalDate ngay;
    private int gia;
    private String loai;

    private float dienTich;

    public float thanhTien() {
        return (int) (this.dienTich * this.gia);
    }

    public GiaoDich(String ma, LocalDate ngay, int gia, String loai, float dienTich) {
        this.ma = ma;
        this.ngay = ngay;
        this.gia = gia;
        this.loai = loai;
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "ma='" + ma + '\'' +
                ", ngay=" + ngay +
                ", gia=" + gia +
                ", loai='" + loai + '\'' +
                ", dienTich=" + dienTich +
                '}';
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }
}