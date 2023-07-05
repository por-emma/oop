package bai07;

import java.time.LocalDate;

public class ThucPham extends HangHoa {
    private String supplier;
    LocalDate mDate, eDate;

    public ThucPham(String id, String name, int price, int stock, String supplier, LocalDate mDate, LocalDate eDate) throws Exception {
        super(id, name, price, stock);
        setVAT((float) 0.05);
        this.supplier = supplier;
        setmDate(mDate);
        seteDate(eDate);
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public LocalDate getmDate() {
        return mDate;
    }

    public void setmDate(LocalDate mDate) {
        if (mDate.isBefore(LocalDate.now()))
            this.mDate = mDate;
        else this.mDate = LocalDate.now();
    }

    public LocalDate geteDate() {
        return eDate;
    }

    public void seteDate(LocalDate eDate) {
        if (eDate.isAfter(this.mDate))
            this.eDate = eDate;
        else this.eDate = this.mDate;
    }

    @Override
    String getType() {
        if (super.getStock() > 0 && !this.eDate.isAfter(LocalDate.now()))
            return "kho ban";
        else return "Khong danh gia";
    }

    @Override
    public String toString() {
        return String.format("%10s %10s %10s %10s %10s %20s", super.getid(), "THUC PHAM", super.getname(), super.getPrice(), super.getStock(), this.getType());
    }
}
