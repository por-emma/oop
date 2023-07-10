package bai08;

public class Employee extends Person {
    private float salary;

    public Employee(String name, String address, float salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                "} " + super.toString();
    }

//    public float calcSalary() {
//        return
//    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
