package bai03;

import java.time.LocalDate;

public class Vang extends GiaoDich {
    private String loai;

    public Vang(String ma, LocalDate ngay, int gia, int sl, String loai) {
        super(ma, ngay, gia, sl);
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
}
