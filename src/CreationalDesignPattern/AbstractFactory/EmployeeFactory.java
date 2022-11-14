package CreationalDesignPattern.AbstractFactory;

public abstract class EmployeeFactory {
    public abstract Manager getManager(EmployeeType type, String id, String name);
    public abstract Developer getDeveloper(EmployeeType type, String id, String name, Employee reportsTo);
}
