package bai05;

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public double earnings() {
        return super.earnings() + this.baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nbase salary: " + this.baseSalary;
    }

    public BasePlusCommissionEmployee() {
        super();
        setBaseSalary(0);
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, int SSN, int grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, SSN, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

class CommissionEmployee extends Employee {
    private int grossSales;
    private double commissionRate;

    @Override
    public String toString() {
        return super.toString() +
                "\ngross sales: " + this.grossSales +
                "\ncommission rate: " + this.commissionRate;
    }

    public double earnings() {
        return this.commissionRate * this.grossSales;
    }

    public CommissionEmployee() {
        super();
        setGrossSales(0);
        setCommissionRate(0);
    }

    public CommissionEmployee(String firstName, String lastName, int SSN, int grossSales, double commissionRate) {
        super(firstName, lastName, SSN);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}

class HourlyEmployee extends Employee {
    private int hours;
    private double wage;

    @Override
    public String toString() {
        return super.toString() +
                "\nhourly wage: " + this.wage +
                "; hours worked: " + this.hours;
    }

    public double earnings() {
        if (this.hours <= 40)
            return this.wage * this.hours;
        else return 40 * this.wage + (this.hours - 40) * this.wage * 1.5;
    }

    public HourlyEmployee() {
        super();
        setHours(0);
        setWage(0);
    }

    public HourlyEmployee(String firstName, String lastName, int SSN, int hours, double wage) {
        super(firstName, lastName, SSN);
        this.hours = hours;
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    @Override
    public String toString() {
        return super.toString() +
                "\nweekly salary: " + this.weeklySalary;
    }

    public double earnings() {
        return weeklySalary;
    }

    public SalariedEmployee() {
        super();
        setWeeklySalary(0);
    }

    public SalariedEmployee(String firstName, String lastName, int SSN, double weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}

public abstract class Employee {
    private String firstName, lastName;
    private int SSN;

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName +
                "\nsocial security number: " + this.SSN;
    }

    abstract double earnings();

    public Employee() {
        setFirstName(null);
        setLastName(null);
        setSSN(0);
    }

    public Employee(String firstName, String lastName, int SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
}