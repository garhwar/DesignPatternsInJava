package CreationalDesignPattern.AbstractFactory;

public class AbstractFactoryDemo {

    public static void main(String[] args)
    {
        EmployeeFactory managerFactory = new ManagerFactory();
        Employee assistantManager = managerFactory.getManager(
                EmployeeType.ASSISTANT_MANAGER, "1", "The Assistant Manager");
        System.out.println("ASSISTANT MANAGER DETAILS: ");
        System.out.println(assistantManager.getEmployeeDetails());

        EmployeeFactory developerFactory = new DeveloperFactory();
        Employee juniorDeveloper = developerFactory.getDeveloper(
                EmployeeType.JUNIOR_DEVELOPER, "2", "The Junior Developer", assistantManager);
        System.out.println("JUNIOR DEVELOPER DETAILS: ");
        System.out.println(juniorDeveloper.getEmployeeDetails());

        System.out.println("###############################");
        Employee seniorManager = managerFactory.getManager(
                EmployeeType.SENIOR_MANAGER, "3", "The Senior Manager");
        System.out.println("SENIOR MANAGER DETAILS: ");
        System.out.println(seniorManager.getEmployeeDetails());

        Employee seniorDeveloper = developerFactory.getDeveloper(
                EmployeeType.JUNIOR_DEVELOPER, "4", "The Senior Developer", seniorManager);
        System.out.println("SENIOR DEVELOPER DETAILS: ");
        System.out.println(seniorDeveloper.getEmployeeDetails());
    }
}
