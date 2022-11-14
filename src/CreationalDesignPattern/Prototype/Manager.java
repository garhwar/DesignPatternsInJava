package CreationalDesignPattern.Prototype;

public class Manager extends Employee {

    public Manager(String id, String name) {
        super(id, name);
    }

    @Override
    public Employee copy() {
        Manager managerClone = new Manager(this.getId(), this.getName());
        return managerClone;
    }
}
