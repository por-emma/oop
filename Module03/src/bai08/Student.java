package bai08;

public class Student extends Person {
    private float sub1, sub2;

    public float calcAvg() {
        return (sub1 + sub2) / 2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sub1=" + sub1 +
                ", sub2=" + sub2 +
                "} " + super.toString();
    }

    public Student(String name, String address, float sub1, float sub2) {
        super(name, address);
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public float getSub1() {
        return sub1;
    }

    public void setSub1(float sub1) {
        this.sub1 = sub1;
    }

    public float getSub2() {
        return sub2;
    }

    public void setSub2(float sub2) {
        this.sub2 = sub2;
    }
}