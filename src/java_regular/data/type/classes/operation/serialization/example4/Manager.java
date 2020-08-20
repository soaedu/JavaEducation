package java_regular.data.type.classes.operation.serialization.example4;

public class Manager extends Employee {
    private double bonus;
    private Employee secretary;

    public Manager(String n, double s, int y) {
        super(n,s,y);
        bonus = 0;
        secretary = null;
    }

    public void setSecretary(Employee s) {
        secretary = s;
    }

    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public String toString() {
        return super.toString() + "[bonus="+bonus+", secreatry="+secretary+"]";
    }
}
