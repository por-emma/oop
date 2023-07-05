package bai07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachHangHoa {
    ArrayList<HangHoa> ds;

    public DanhSachHangHoa(int n) {
        ds = new ArrayList<>(n);
    }

    public boolean add(HangHoa item) {
        for (int i = 0; i < ds.size(); i++)
            if (ds.get(i).getid() == item.getid())
                return false;
        ds.add(item);
        return true;
    }

    public void printAll() {
        System.out.println(String.format("%10s %10s %10s %10s %10s %20s", "MA_HANG", "LOAI_HANG", "TEN_HANG", "DON_GIA", "KHO_TON", "GHI_CHU"));
        for (int i = 0; i < ds.size(); i++)
            System.out.println(ds.get(i).toString());
    }

    public void printByType() {
//        System.out.println(ds.get(0) instanceof HangHoa);
//        System.out.println(ds.get(0) instanceof ThucPham);
//        System.out.println(ds.get(0) instanceof SanhSu);
//        System.out.println(ds.get(0) instanceof DienMay);
        System.out.println(String.format("%10s %10s %10s %10s %10s %20s", "MA_HANG", "LOAI_HANG", "TEN_HANG", "DON_GIA", "KHO_TON", "GHI_CHU"));
        for (int i = 0; i < ds.size(); i++)
            if (ds.get(i) instanceof ThucPham)
                System.out.println(ds.get(i).toString());
        System.out.println(String.format("%10s %10s %10s %10s %10s %20s", "MA_HANG", "LOAI_HANG", "TEN_HANG", "DON_GIA", "KHO_TON", "GHI_CHU"));
        for (int i = 0; i < ds.size(); i++)
            if (ds.get(i) instanceof SanhSu)
                System.out.println(ds.get(i).toString());
        System.out.println(String.format("%10s %10s %10s %10s %10s %20s", "MA_HANG", "LOAI_HANG", "TEN_HANG", "DON_GIA", "KHO_TON", "GHI_CHU"));
        for (int i = 0; i < ds.size(); i++)
            if (ds.get(i) instanceof DienMay)
                System.out.println(ds.get(i).toString());
    }

    public HangHoa find(String id) throws Exception {
        for (int i = 0; i < ds.size(); i++)
            if (ds.get(i).getid().equals(id))
                return ds.get(i);
        throw new Exception("No id matched");
    }

    public void sortAsc() {
        for (int i = 0; i < ds.size(); i++)
            for (int j = i; j < ds.size(); j++)
                if (ds.get(i).getname().compareTo(ds.get(j).getname()) > 0)
                    Collections.swap(ds, i, j);
    }

    public void sortDesc() {
        for (int i = 0; i < ds.size(); i++)
            for (int j = i; j < ds.size(); j++)
                if (ds.get(i).getStock() < ds.get(i).getStock())
                    Collections.swap(ds, i, j);
    }

    public void printKhoBan() {
        System.out.println(String.format("\n%10s %10s %10s %10s %10s %20s", "MA_HANG", "LOAI_HANG", "TEN_HANG", "DON_GIA", "KHO_TON", "GHI_CHU"));
        for (int i = 0; i < ds.size(); i++)
            if (ds.get(i).getType().equals("Kho ban"))
                System.out.println(ds.get(i).toString());
    }

    public boolean remove(String id) {
        for (int i = 0; i < ds.size(); i++)
            if (ds.get(i).getid().equals(id)) {
                ds.remove(i);
                return true;
            }
        return false;
    }

    public boolean edit(String id, int price) throws Exception {
        for (int i = 0; i < ds.size(); i++)
            if (ds.get(i).equals(id)) {
                ds.get(i).setPrice(price);
                return true;
            }
        return false;
    }
}
