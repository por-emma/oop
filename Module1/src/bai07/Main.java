package bai07;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        DanhSachHangHoa ds = new DanhSachHangHoa(3);
        ds.add(new DienMay("DM1", "Purifier", 5000, 3, 7, 4));
        ds.add(new SanhSu("SS1", "Pot", 300, 1, "Vietnam Inc.", LocalDate.of(2023, 5, 5)));
        ds.add(new ThucPham("TP1", "Chicken", 2, 5, "Metro Mart", LocalDate.of(2023, 7, 5), LocalDate.of(2023, 8, 1)));
        ds.printAll();
        ds.printByType();
        System.out.println("HANG HOA CAN TIM LA: ");
        System.out.println(ds.find("DM1").toString());
        ds.sortAsc();
        ds.printAll();
        ds.sortDesc();
        ds.printAll();
        ds.printKhoBan();
        ds.remove("SS1");
        ds.edit("TP1",500);
        ds.printAll();
    }
}
