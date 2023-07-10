package bai04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class QLSinhVien {
    ArrayList<SinhVien> ds;

    public QLSinhVien() {
        ds = new ArrayList<>();
    }

    public boolean add(SinhVien newSV) {
        for (SinhVien sv : ds) {
            if (sv.getId().equals(newSV.getId()))
                return false;
        }
        ds.add(newSV);
        return true;
    }

    public void printAll() {
        System.out.println("DANH SACH SINH VIEN");
        System.out.println(String.format("%10s %15s %7s", "STUDENT ID", "NAME", "YOB"));
        for (SinhVien sv : ds)
            System.out.println(sv.toString());
    }

    public boolean remove(String data) {
        for (SinhVien sv : ds) {
            if (sv.getId().equals(data)) {
                ds.remove(sv);
                return true;
            }
        }
        return false;
    }

    public boolean edit(String data) {
        for (SinhVien sv : ds) {
            if (sv.getId().equals(data)) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter new name: ");
                sv.setName(sc.nextLine());
                System.out.print("Enter new year of birth: ");
                sv.setYOB(sc.nextInt());
                return true;
            }
        }
        return false;
    }

    public boolean findByID(String data) {
        for (SinhVien sv : ds) {
            if (sv.getId().equals(data)) {
                System.out.println("THONG TIN SINH VIEN CAN TIM");
                System.out.println(String.format("%10s %15s %7s", "STUDENT ID", "NAME", "YOB"));
                System.out.println(sv.toString());
                return true;
            }
        }
        System.out.println("MA SINH VIEN KHONG TON TAI");
        return false;
    }

    public boolean findByName(String data) {
        for (SinhVien sv : ds) {
            if (sv.getName().equals(data)) {
                System.out.println("THONG TIN SINH VIEN CAN TIM");
                System.out.println(String.format("%10s %15s %7s", "STUDENT ID", "NAME", "YOB"));
                System.out.println(sv.toString());
                return true;
            }
        }
        System.out.println("TEN VIEN KHONG TON TAI");
        return false;
    }

    public void sortAsc() {
        for (int i = 0; i < ds.size(); i++)
            for (int j = i; j < ds.size(); j++)
                if (ds.get(i).getId().compareTo(ds.get(j).getId()) > 0)
                    Collections.swap(ds, i, j);
    }
}
