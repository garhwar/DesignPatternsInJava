package CreationalDesignPattern.AbstractFactory;

public class ManagerFactory extends EmployeeFactory {

    @Override
    public Manager getManager(EmployeeType type, String id, String name) {
        if (type == EmployeeType.ASSISTANT_MANAGER)
            return new AssistantManager(id, name);
        else if(type == EmployeeType.SENIOR_MANAGER)
            return new SeniorManager(id, name);
        else
            throw new IllegalArgumentException("Invalid employee type");
    }

    @Override
    public Developer getDeveloper(EmployeeType type, String id, String name, Employee reportsTo) {
        return null;
    }
}
