package bai06;

import java.time.LocalDate;
import java.util.Date;

public class DanhSachHoaDon {
    private HoaDon[] ds = new HoaDon[100];
    private int count;

    public DanhSachHoaDon(int count) {
        this.count = count;
    }

    public boolean them(HoaDon hd) {
        for (int i = 0; i < count; i++)
            if (ds[i].getMa().equals(hd.getMa()))
                return false;
        ds[count] = hd;
        ++count;
        return true;
    }

    public void xuat() {
        System.out.println("Danh sach hoa don");
        System.out.printf("\n%10s %10s %10s %10s %10s %10s\n", "Ma_hoa_don", "Ngay_HD", "Ten_khach", "Ma_phong", "Don_gia", "Loai_HD");
        for (int i = 0; i < this.count; i++)
            System.out.println(ds[i].toString());
    }

    public int thongKeSoLuongHDTheoGio() {
        int temp = 0;
        for (int i = 0; i < this.count; i++)
            if (ds[i] instanceof Hourly)
                ++temp;
        return temp;
    }

    public int thongKeSoLuongHDTheoNgay() {
        int temp = 0;
        for (int i = 0; i < this.count; i++)
            if (ds[i] instanceof Daily)
                ++temp;
        return temp;
    }

    public double tinhTongThanhTien(int thang, int nam) {
        double total = 0;
        for (int i = 0; i < this.count; i++)
            if (ds[i].getDate().getYear() == nam && ds[i].getDate().getMonth().getValue() == thang) {
                try {
                    total += ds[i].thanhTien();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        return total;
    }

    public HoaDon[] getDs() {
        return ds;
    }

    public void setDs(HoaDon[] ds) {
        this.ds = ds;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
