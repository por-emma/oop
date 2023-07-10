package bai04;

public class SinhVien {
    private String id, name;
    private int YOB;

    @Override
    public String toString() {
        return String.format("%10s %15s %7s", this.id, this.name, this.YOB);
    }

    public SinhVien(String id, String name, int YOB) {
        this.id = id;
        this.name = name;
        this.YOB = YOB;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }
}
