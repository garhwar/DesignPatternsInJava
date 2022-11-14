package CreationalDesignPattern.Prototype;

public class Developer extends Employee {

    private Employee reportsTo;

    public Developer(String id, String name) {
        super(id, name);
    }

    public Employee getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Employee reportsTo) {
        this.reportsTo = reportsTo;
    }

    @Override
    public Employee copy() {
        Developer developerClone = new Developer(this.getId(), this.getName());
        developerClone.setReportsTo(this.reportsTo);
        return developerClone;
    }
}
