package bai04;

import java.time.LocalDate;

public class Dat extends GiaoDich {

    public Dat(String ma, LocalDate ngay, int gia, String loai, float dienTich) {
        super(ma, ngay, gia, loai, dienTich);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public float thanhTien() {
        if (super.getLoai().equals("A"))
            return (float) (super.thanhTien() * 1.5);
        else return super.thanhTien();
    }
}
