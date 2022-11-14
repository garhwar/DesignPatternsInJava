package CreationalDesignPattern.AbstractFactory;

public class DeveloperFactory extends EmployeeFactory {

    @Override
    public Manager getManager(EmployeeType type, String id, String name) {
        return null;
    }

    @Override
    public Developer getDeveloper(EmployeeType type, String id, String name, Employee reportsTo) {
        if (type == EmployeeType.JUNIOR_DEVELOPER)
            return new JuniorDeveloper(id, name, reportsTo);
        else if(type == EmployeeType.SENIOR_DEVELOPER)
            return new SeniorDeveloper(id, name, reportsTo);
        else
            throw new IllegalArgumentException("Invalid employee type");
    }
}
