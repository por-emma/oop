package bai05;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) throws Exception {
		HangThucPham tester1 = new HangThucPham("001", "Gạo", 100000, LocalDate.of(2018, 7, 10),
				LocalDate.of(2018, 7, 19));
		HangThucPham tester2 = new HangThucPham("002", "MÌ", 5000, LocalDate.of(2018, 3, 1), LocalDate.of(2018, 9, 1));
		HangThucPham tester3 = new HangThucPham("003", "Nước", 10000, LocalDate.of(2017, 3, 1),
				LocalDate.of(2018, 3, 1));
		System.out.println(String.format("%-10s %-10s %15s %-20s %-20s %-15s","Mã_Hàng","Tên_Hàng","Đơn_Giá","Ngày_Sản_Xuất","Ngày_Hết_Hạn","Ghi_Chú"));
		System.out.println("===============================================================================");
		System.out.println(tester1.toString());
		System.out.println(tester2.toString());
		System.out.println(tester3.toString());
	}
}
