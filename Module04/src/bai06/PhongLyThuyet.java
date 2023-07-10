package bai06;

public class PhongLyThuyet extends Phong {
    private boolean mayChieu;

    public PhongLyThuyet(String ma, int day, float dienTich, int bongDen, boolean mayChieu) {
        super(ma, day, dienTich, bongDen);
        this.mayChieu = mayChieu;
        if (super.getDienTich() / 10 >= super.getBongDen() && this.mayChieu)
            super.setDatChuan(true);
    }


    public boolean isMayChieu() {
        return mayChieu;
    }

    public void setMayChieu(boolean mayChieu) {
        this.mayChieu = mayChieu;
    }
}
