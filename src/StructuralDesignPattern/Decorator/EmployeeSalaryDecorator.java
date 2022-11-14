package StructuralDesignPattern.Decorator;

public class EmployeeSalaryDecorator extends EmployeeDecorator {

    public EmployeeSalaryDecorator(Employee decoratedEmployee) {
        super(decoratedEmployee);
    }

    private int getBonus(Employee decoratedEmployee)
    {
        return 10000;
    }

    @Override
    public int getSalary()
    {
        return decoratedEmployee.getSalary() + getBonus(decoratedEmployee);
    }
}
