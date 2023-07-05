package bai07;

public abstract class HangHoa {
    private String id, name;
    private int price, stock;

    private float VAT;

    public void setVAT(float VAT) {
        this.VAT = VAT;
    }

    public HangHoa(String id, String name, int price, int stock) throws Exception {
        if (id != null)
            this.id = id;
        else throw new Exception("ID must not be null");
        setname(name);
        setPrice(price);
        setStock(stock);
    }

    public String getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        if (!name.equals(null))
            this.name = name;
        else this.name = "xxx";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws Exception {
        if (price >= 0)
            this.price = price;
        else throw new Exception("Price must be greater than 0");
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) throws Exception {
        if (stock >= 0)
            this.stock = stock;
        else throw new Exception("Stock must be greater than 0");
    }

    abstract String getType();
}
