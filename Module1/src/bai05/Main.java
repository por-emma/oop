package bai05;

public class Main {
    public static void main(String args[]) {
        Employee[] obj = new Employee[4];
        obj[0] = new SalariedEmployee("Duyen", "Le", 1024, 400000);
        obj[1] = new HourlyEmployee("Emma", "Le", 2411, 12, 215000);
        obj[2] = new CommissionEmployee("Tae-ui", "Jeong", 1345, 30, 15000);
        obj[3] = new BasePlusCommissionEmployee("Ilay", "Riegrow", 4544, 30, 20000, 70000000);
        for (Employee em : obj)
            System.out.println(em.toString());
    }
}
