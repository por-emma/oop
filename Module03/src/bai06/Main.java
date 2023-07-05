package bai06;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DanhSachHoaDon ds = new DanhSachHoaDon(0);
        Controller c = new Controller();
        int choice;
        do {
            choice = c.printMenu();
            switch (choice) {
                case 1:
                    if(ds.them(c.taoHoaDon()))
                        System.out.println("Them thanh cong");
                    else System.out.println("Ma hoa don da ton tai!");
                    break;
                case 2:
                    ds.xuat();
                    break;
                case 3:
                    System.out.println("So luong hoa don theo gio la " + ds.thongKeSoLuongHDTheoGio());
                    break;
                case 4:
                    System.out.println("So luong hoa don theo ngay la " + ds.thongKeSoLuongHDTheoNgay());
                    break;
                case 5:
                    System.out.println("Tong thanh tien la " + ds.tinhTongThanhTien(c.nhapThang(), c.nhapNam()));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nhap khong hop le");
            }
        } while (choice != 0);
    }


}

class Controller {
    Scanner sc = new Scanner(System.in);

    int printMenu() {
        System.out.println("\n1. Them");
        System.out.println("2. Xuat");
        System.out.println("3. Thong ke so luong hoa don theo gio");
        System.out.println("4. thong ke so luong hoa don theo ngay");
        System.out.println("5. Tinh tong thanh tien");
        System.out.println("0. Thoat");
        System.out.print("Vui long chon: ");
        return sc.nextInt();
    }

    HoaDon taoHoaDon() {
        sc.nextLine();
        System.out.print("Nhap ma hoa don: ");
        String ma = sc.nextLine();
        System.out.print("Nhap ngay: ");
        int dd = sc.nextInt();
        System.out.print("Nhap thang: ");
        int mm = sc.nextInt();
        System.out.print("Nhap nam: ");
        int yyyy = sc.nextInt();
        System.out.print("Nhap ten khach hang: ");
        sc.nextLine();
        String ten = sc.nextLine();
        System.out.print("Nhap ma phong: ");
        String phong = sc.nextLine();
        System.out.print("Nhap don gia: ");
        int gia = sc.nextInt();
        System.out.print("Nhap loai hoa don (gio/ngay): ");
        sc.nextLine();
        String loai = sc.nextLine();
        if (loai.equals("gio")) {
            System.out.print("Nhap so gio thue: ");
            int gio = sc.nextInt();
            return new Hourly(ma, LocalDate.of(yyyy, mm, dd), ten, phong, gia, gio);
        } else {
            System.out.print("Nhap so ngay thue: ");
            int ngay = sc.nextInt();
            return new Daily(ma, LocalDate.of(yyyy, mm, dd), ten, phong, gia, ngay);
        }
    }

    int nhapThang() {
        System.out.print("Nhap thang: ");
        return sc.nextInt();
    }

    int nhapNam() {
        System.out.print("Nhap nam: ");
        return sc.nextInt();
    }
}
