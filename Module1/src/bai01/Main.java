package bai01;

import java.text.DecimalFormat;

public class Main {
    public static void main(String args[]) {
        NoiThanh xe1 = new NoiThanh("148", "Duc", "14893-00", 300000, 60, 12);
        NoiThanh xe2 = new NoiThanh("145", "Thanh", "14543-33", 300000, 40, 10);
        NgoaiThanh xe3 = new NgoaiThanh("150", "Trung", "15056-86", 400000, "Bien Hoa", 1);
        NgoaiThanh xe4 = new NgoaiThanh("688", "Tai", "68832-42", 300000, "Suoi Tien", 1);
        DecimalFormat fm = new DecimalFormat("###,###VND");
        System.out.println("Doanh thu:");
        System.out.println(fm.format(xe1.getDoanhThu()));
        System.out.println(fm.format(xe2.getDoanhThu()));
        System.out.println(fm.format(xe3.getDoanhThu()));
        System.out.println(fm.format(xe4.getDoanhThu()));
        System.out.println("Tong doanh thu: " + fm.format(xe1.getDoanhThu() + xe2.getDoanhThu() + xe3.getDoanhThu() + xe4.getDoanhThu()));
    }
}
