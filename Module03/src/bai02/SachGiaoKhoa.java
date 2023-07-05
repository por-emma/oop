package bai02;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
    private boolean tinhTrang;

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public SachGiaoKhoa(String maSach, String nhaXuatBan, double donGia, int soLuong, LocalDate ngayNhap, boolean tinhTrang) {
        super(maSach, nhaXuatBan, donGia, soLuong, ngayNhap);
        this.tinhTrang = tinhTrang;
    }

    public SachGiaoKhoa() {
        super();
        setTinhTrang(false);
    }

    public double getThanhTien() {
        if (this.tinhTrang)
            return super.getThanhTien();
        else return super.getThanhTien() * 0.5;
    }

    @Override
    public String toString() {
        return "SachGiaoKhoa{" +
                "tinhTrang=" + tinhTrang +
                '}';
    }
}
