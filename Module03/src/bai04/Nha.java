package bai04;

import java.time.LocalDate;

public class Nha extends GiaoDich {
    private String diaChi;

    @Override
    public float thanhTien() {
        if (super.getLoai().equals("caocap"))
            return super.thanhTien();
        else return (float) (super.thanhTien() * 0.9);
    }

    @Override
    public String toString() {
        return "Nha{" +
                "diaChi='" + diaChi + '\'' +
                '}';
    }

    public Nha(String ma, LocalDate ngay, int gia, String loai, float dienTich, String diaChi) {
        super(ma, ngay, gia, loai, dienTich);
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
