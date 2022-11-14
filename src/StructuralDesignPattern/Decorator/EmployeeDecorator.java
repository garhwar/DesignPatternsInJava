package StructuralDesignPattern.Decorator;

public class EmployeeDecorator implements Employee {

    protected Employee decoratedEmployee;

    public EmployeeDecorator(Employee decoratedEmployee) {
        this.decoratedEmployee = decoratedEmployee;
    }

    @Override
    public int getSalary() {
        return decoratedEmployee.getSalary();
    }
}
