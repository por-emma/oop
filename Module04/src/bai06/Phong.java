package bai06;

public class Phong {
    private String ma;
    private int day;
    private float dienTich;
    private int bongDen;
    private boolean datChuan;

    public Phong(String ma, int day, float dienTich, int bongDen) {
        this.ma = ma;
        this.day = day;
        this.dienTich = dienTich;
        this.bongDen = bongDen;
    }

    public boolean isDatChuan() {
        return datChuan;
    }

    public void setDatChuan(boolean datChuan) {
        this.datChuan = datChuan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public int getBongDen() {
        return bongDen;
    }

    public void setBongDen(int bongDen) {
        this.bongDen = bongDen;
    }
}
