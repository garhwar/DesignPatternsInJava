package CreationalDesignPattern.FactoryMethod;

public class FactoryMethodDemo {

    public static void main(String[] args)
    {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee manager = employeeFactory.getEmployee(
                EmployeeType.MANAGER, "1", "The Manager", null);
        System.out.println("MANAGER DETAILS: ");
        System.out.println(manager.getEmployeeDetails());
        Employee developer = employeeFactory.getEmployee(
                EmployeeType.DEVELOPER, "2", "The Developer", manager);
        System.out.println("DEVELOPER DETAILS: ");
        System.out.println(developer.getEmployeeDetails());
    }
}
