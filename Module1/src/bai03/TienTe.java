package bai03;

import java.time.LocalDate;

public class TienTe extends GiaoDich {
    private float tiGia;
    private String loai;

    public TienTe(String ma, LocalDate ngay, int gia, int sl, float tiGia, String loai) {
        super(ma, ngay, gia, sl);
        this.tiGia = tiGia;
        this.loai = loai;
    }

    @Override
    public int thanhTien() {
        if (loai.equals("VND"))
            return super.thanhTien();
        else return (int) (super.thanhTien() * tiGia);
    }
}
