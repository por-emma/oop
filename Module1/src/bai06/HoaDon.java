package bai06;

import java.time.LocalDate;

public abstract class HoaDon {
    private String ma;
    private LocalDate date;
    private String name, room;
    private int price;

    abstract int thanhTien() throws Exception;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%10s %10s %10s %10s %10d", this.getMa(), this.getDate(), this.getName(), this.getRoom(), this.getPrice());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public HoaDon(String ma, LocalDate date, String name, String room, int price) {
        this.ma = ma;
        this.date = date;
        this.name = name;
        this.room = room;
        this.price = price;
    }
}
