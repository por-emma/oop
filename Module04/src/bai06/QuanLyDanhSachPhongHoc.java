package bai06;

import java.util.ArrayList;
import java.util.Collections;

public class QuanLyDanhSachPhongHoc {
    ArrayList<Phong> ds;

    public QuanLyDanhSachPhongHoc() {
        ds = new ArrayList<>();
    }

    public boolean them(Phong data) {
        for (Phong p : ds)
            if (p.getMa().equals(data.getMa())) {
                System.out.println("Ma phong da ton tai");
                return false;
            }
        ds.add(data);
        System.out.println("Them thanh cong!");
        return true;
    }

    public boolean timBangMa(String id) {
        for (Phong p : ds)
            if (p.getMa().equals(id)) {
                System.out.println("Ma phong can tim la: ");
                System.out.println(p.toString());
                return true;
            }
        System.out.println("Ma phong khong co!");
        return false;
    }

    public void inToanBo() {
        System.out.println("\nDANH SACH CAC PHONG HOC");
        for (Phong p : ds)
            System.out.println(p.toString());
    }

    public void inDatChuan() {
        System.out.println("\nDANH SACH CAC PHONG HOC DAT CHUAN");
        for (Phong p : ds)
            if (p.isDatChuan())
                System.out.println(p.toString());
    }

    public void sapXepTangDanTheoDayNha() {
        for (int i = 0; i < ds.size(); i++)
            for (int j = i; j < ds.size(); j++)
                if (ds.get(i).getDay() > ds.get(j).getDay())
                    Collections.swap(ds, i, j);

    }

    public void sapXepGiamDanTheoDienTich() {
        for (int i = 0; i < ds.size(); i++)
            for (int j = i; j < ds.size(); j++)
                if (ds.get(i).getDienTich() < ds.get(j).getDienTich())
                    Collections.swap(ds, i, j);

    }

    public void sapXepTangDanTheoBongDen() {
        for (int i = 0; i < ds.size(); i++)
            for (int j = i; j < ds.size(); j++)
                if (ds.get(i).getBongDen() > ds.get(j).getBongDen())
                    Collections.swap(ds, i, j);
    }

    public boolean catNhat(String ma, int soMay) {
        for (Phong p : ds)
            if (p.getMa().equals(ma)) {
                return true;
            }
        return false;
    }
}
