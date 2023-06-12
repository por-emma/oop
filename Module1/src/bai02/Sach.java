package bai02;

import java.time.LocalDate;

public class Sach {
    private String maSach, nhaXuatBan;
    private double donGia;
    private int soLuong;
    private LocalDate ngayNhap;

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public Sach(String maSach, String nhaXuatBan, double donGia, int soLuong, LocalDate ngayNhap) {
        this.maSach = maSach;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
    }

    public Sach() {
        setMaSach(null);
        setNhaXuatBan(null);
        setDonGia(0);
        setSoLuong(0);
    }

    public double getThanhTien() {
        return this.soLuong * this.donGia;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "soLuong=" + soLuong +
                '}';
    }
}
