package bai01;

public class NgoaiThanh extends Xe {
    private String noiDen;
    private int soNgay;

    public NgoaiThanh(String maSoChuyen, String tenTaiXe, String soXe, long doanhThu, String noiDen, int soNgay) {
        super(maSoChuyen, tenTaiXe, soXe, doanhThu);
        setNoiDen(noiDen);
        setSoNgay(soNgay);
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
}
