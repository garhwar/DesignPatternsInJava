package StructuralDesignPattern.Decorator;

public class DecoratorDemo {

    public static void main(String[] args)
    {
        Employee developer = new Developer(10000);

        Employee developerWithBonusSalary
                = new EmployeeSalaryDecorator(developer);

        // Display message
        System.out.println("Print Employee salary with bonus component");

        System.out.println(developerWithBonusSalary.getSalary());
    }

}
