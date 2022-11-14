package StructuralDesignPattern.Decorator;

public class Developer implements Employee {

    int salary;

    public Developer(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

}
