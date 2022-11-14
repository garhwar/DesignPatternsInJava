package CreationalDesignPattern.FactoryMethod;

public class Manager implements Employee {

    String id;
    String name;

    public Manager(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getEmployeeDetails() {
        return "Id: " + this.id + ", " +  "Name: " + this.name;
    }

}
