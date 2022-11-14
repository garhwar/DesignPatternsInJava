package CreationalDesignPattern.FactoryMethod;

public class EmployeeFactory {

    public Employee getEmployee(EmployeeType type, String id, String name, Employee reportsTo) {
        if (type == EmployeeType.MANAGER)
            return new Manager(id, name);
        else if(type == EmployeeType.DEVELOPER)
            return new Developer(id, name, reportsTo);
        else
            throw new IllegalArgumentException("Invalid employee type");
    }
}
