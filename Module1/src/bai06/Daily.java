package bai06;

import java.time.LocalDate;

public class Daily extends HoaDon {

    private int days;

    @Override
    public String toString() {
        return String.format("%10s %10s %10s %10s %10d %10s", super.getMa(), super.getDate(), super.getName(), super.getRoom(), super.getPrice(), "Theo ngay");
    }

    @Override
    int thanhTien() {
        if (days <= 7)
            return super.getPrice() * days;
        else return (int) (super.getPrice() * (days - 7) * 0.8 + super.getPrice() * 7);
    }

    public Daily(String ma, LocalDate date, String name, String room, int price, int days) {
        super(ma, date, name, room, price);
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
