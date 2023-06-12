package bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Sach[] sach = new Sach[6];
        sach[0] = new SachThamKhao("sach1", "Kim Dong", 23000, 19, LocalDate.of(2022, 12, 1), 0.05);
        sach[1] = new SachThamKhao("sach2", "NXB Tre", 90000, 10, LocalDate.now(), 0.05);
        sach[2] = new SachThamKhao("sach3", "Kim Dong", 123000, 3, LocalDate.of(2022, 4, 12), 0.05);
        sach[3] = new SachGiaoKhoa("sach1", "BGD", 21000, 1, LocalDate.now(), true);
        sach[4] = new SachGiaoKhoa("sach2", "BGD", 13000, 1, LocalDate.now(), true);
        sach[5] = new SachGiaoKhoa("sach3", "BGD", 12000, 1, LocalDate.of(2022, 4, 24), false);
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        DecimalFormat fm = new DecimalFormat("###,###VND");
        System.out.println("Tong thanh tien SGK la " + fm.format(obj.tinhTongThanhTienSGK(sach)));
        System.out.println("Tong thanh tien STK la " + fm.format(obj.tinhTongThanhTienSTK(sach)));
        System.out.print("Nhap NXB can tim: ");
        String k = sc.nextLine();
        for (Sach s : obj.timSachGiaoKhoaTheoNXB(sach, k))
            System.out.println(s.toString());
        System.out.println("Thanh tien cao nhat la " + obj.timThanhTienCaoNhat(sach));
    }

    public double tinhTongThanhTienSGK(Sach[] sach) {
        double result = 0;
        for (Sach s : sach)
            if (s instanceof SachGiaoKhoa)
                result += s.getThanhTien();
        return result;
    }

    public double tinhTongThanhTienSTK(Sach[] sach) {
        double result = 0;
        for (Sach s : sach)
            if (s instanceof SachThamKhao)
                result += s.getThanhTien();
        return result;
    }

    public List<Sach> timSachGiaoKhoaTheoNXB(Sach[] sgk, String nxb) {
        List<Sach> sach = new ArrayList<>();
        for (Sach s : sgk)
            if (s instanceof SachGiaoKhoa && s.getNhaXuatBan().equals(nxb))
                sach.add(s);
        return sach;
    }

    public double timThanhTienCaoNhat(Sach[] sach) {
        double result = 0;
        for (Sach s : sach)
            if (s.getThanhTien() > result)
                result = s.getThanhTien();
        return result;
    }
}
