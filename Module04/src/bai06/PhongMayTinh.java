package bai06;

public class PhongMayTinh extends Phong {
    private int mayTinh;

    public PhongMayTinh(String ma, int day, float dienTich, int bongDen, int mayTinh) {
        super(ma, day, dienTich, bongDen);
        this.mayTinh = mayTinh;
        if (super.getDienTich() / 10 >= super.getBongDen() && super.getDienTich()/1.5 >= this.mayTinh)
            super.setDatChuan(true);
    }

    public int getMayTinh() {
        return mayTinh;
    }

    public void setMayTinh(int mayTinh) {
        this.mayTinh = mayTinh;
    }
}
