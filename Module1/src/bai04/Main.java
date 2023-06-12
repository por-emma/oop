package bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GiaoDich gd1 = new Nha("GD1", LocalDate.of(2023, 9, 7), 1000000000, "caocap", 103, "113 Pasteur");
        GiaoDich gd2 = new Dat("GD2", LocalDate.of(2013, 9, 10), 300000000, "A", 350);
        GiaoDich gd3 = new Dat("GD3", LocalDate.of(2023, 1, 9), 240000000, "C", 300);
        DecimalFormat fm = new DecimalFormat("###,###,###,###");
        System.out.println("TB thanh tien: " + fm.format((gd1.thanhTien() + gd2.thanhTien() + gd3.thanhTien()) / 3));
        System.out.println("Cac giao dich thang 9/2013");
        if (gd1.getNgay().isAfter(LocalDate.of(2013, 8, 31)) && gd1.getNgay().isBefore(LocalDate.of(2013, 10, 1)))
            System.out.println(gd1.toString());
        if (gd2.getNgay().isAfter(LocalDate.of(2013, 8, 31)) && gd2.getNgay().isBefore(LocalDate.of(2013, 10, 1)))
            System.out.println(gd2.toString());
        if (gd3.getNgay().isAfter(LocalDate.of(2013, 8, 31)) && gd3.getNgay().isBefore(LocalDate.of(2013, 10, 1)))
            System.out.println(gd3.toString());
    }
}
