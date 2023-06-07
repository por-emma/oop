package bai04;

public class Main {
	public static void main(String[] args) {
		Vehicle xe1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 35000000, 100);
		Vehicle xe2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 250000000, 3000);
		Vehicle xe3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1000000000, 1500);
		System.out.println(String.format("%-20s %-15s %10s %15s %20s", "Tên chủ xe", "Loại xe", "Dung tich", "Trị giá",
				"Thuế phải nộp"));
		System.out.println("====================================================================================");
		System.out.println(xe1.toString());
		System.out.println(xe2.toString());
		System.out.println(xe3.toString());

	}
}
