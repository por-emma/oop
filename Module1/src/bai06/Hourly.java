package bai06;

import java.time.LocalDate;

public class Hourly extends HoaDon {
    private int hours;

    @Override
    int thanhTien() throws Exception {
        if (hours < 24)
            return super.getPrice() * hours;
        else if (hours < 30)
            return super.getPrice() * 24;
        else throw new Exception("So gio vuot qua 30 gio");
    }

    @Override
    public String toString() {
        return String.format("%10s %10s %10s %10s %10d %10s", super.getMa(), super.getDate(), super.getName(), super.getRoom(), super.getPrice(), "Hourly");
    }

    public Hourly(String ma, LocalDate date, String name, String room, int price, int hours) {
        super(ma, date, name, room, price);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
