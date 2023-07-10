package bai04;

public class Main {
    public static void main(String[] args) {
        QLSinhVien ds = new QLSinhVien();
        ds.add(new SinhVien("001","Le My Duyen",2003));
        ds.add(new SinhVien("002","Le Trieu Vy",2003));
        ds.add(new SinhVien("003","Tran Quoc Khanh",2006));
        ds.add(new SinhVien("004","Tram Thanh Thu",2003));
        ds.add(new SinhVien("005","Jeong Taeui",1981    ));
        ds.printAll();
        ds.add(new SinhVien("005","Ilay Riegrow",1981));
        ds.remove("005");
        ds.edit("001");
        ds.findByID("002");
        ds.findByName("Ilay Riegrow");
        ds.findByName("Tran Quoc Khanh");
        ds.sortAsc();
        ds.printAll();
    }
}
