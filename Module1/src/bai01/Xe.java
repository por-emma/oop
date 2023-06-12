package bai01;

public class Xe {
    private String maSoChuyen, tenTaiXe, soXe;
    private long doanhThu;

    public Xe(String maSoChuyen, String tenTaiXe, String soXe, long doanhThu) {
        setMaSoChuyen(maSoChuyen);
        setTenTaiXe(tenTaiXe);
        setSoXe(soXe);
        setDoanhThu(doanhThu);
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getTenTaiXe() {
        return tenTaiXe;
    }

    public void setTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public long getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(long doanhThu) {
        this.doanhThu = doanhThu;
    }
}
