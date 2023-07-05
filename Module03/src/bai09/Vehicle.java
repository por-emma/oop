package bai09;

public class Vehicle {
    private String brand, model;
    private long price;

    public Vehicle() {
        setBrand(null);
        setModel(null);
        setPrice(0);
    }

    public Vehicle(String brand, String model, long price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class Bike extends Vehicle {
    private double tax = 0;

    public Bike(String brand, String model, long price) {
        super(brand, model, price);
    }

    public double getTax() {
        return tax;
    }
}

class Motorbike extends Vehicle {
    private double tax = 0.05 * super.getPrice(), VAT = 0.1;

    public Motorbike(String brand, String model, long price) {
        super(brand, model, price);
    }

    public double getTax() {
        return tax;
    }

    public double getVAT() {
        return VAT;
    }
}

class Car extends Vehicle {
    private double specialTax, VAT = 0.1, tax = super.getPrice() * 0.02;
    private int seat;

    public Car(String brand, String model, long price, int seat) {
        super(brand, model, price);
        this.seat = seat;
        setSpecialTax();
    }

    public void setSpecialTax() {
        if (seat >= 5)
            this.specialTax = 0.3;
        else this.specialTax = 0.5;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getSpecialTax() {
        return specialTax;
    }

    public double getVAT() {
        return VAT;
    }

    public double getTax() {
        return tax;
    }

    public int getSeat() {
        return seat;
    }
}

class Truck extends Vehicle {
    private double VAT = 0.1, tax = super.getPrice() * 0.02;

    public Truck(String brand, String model, long price) {
        super(brand, model, price);
    }

    public double getVAT() {
        return VAT;
    }

    public double getTax() {
        return tax;
    }
}