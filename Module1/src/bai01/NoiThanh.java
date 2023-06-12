package bai01;

public class NoiThanh extends Xe {
    private int soTuyen, soKM;

    public NoiThanh(String maSoChuyen, String tenTaiXe, String soXe, long doanhThu, int soTuyen, int soKM) {
        super(maSoChuyen, tenTaiXe, soXe, doanhThu);
        setSoTuyen(soTuyen);
        setSoKM(soKM);
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }
}
