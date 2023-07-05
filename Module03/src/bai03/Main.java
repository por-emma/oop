package bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        GiaoDich gd1 = new TienTe("001", LocalDate.of(2023, 6, 12), 5000000, 1, 23.3f, "USD");
        GiaoDich gd2 = new Vang("002", LocalDate.of(2023, 8, 8), 23000, 2, "24K");
        GiaoDich gd3 = new Vang("003", LocalDate.of(2022, 12, 1), 23000, 1, "24K");
        DecimalFormat fm = new DecimalFormat("###,###,###");
        System.out.println("Trung binh thanh tien la: " + fm.format((gd1.thanhTien() + gd2.thanhTien() + gd3.thanhTien()) / 3) + "VND");
        System.out.println("Giao dich co don gia tren 1 ty: ");
        if (gd1.thanhTien() > 1000000000)
            System.out.println(gd1.toString());
        if (gd2.thanhTien() > 1000000000)
            System.out.println(gd2.toString());
        if (gd3.thanhTien() > 1000000000)
            System.out.println(gd3.toString());
    }
}
