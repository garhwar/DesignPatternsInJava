package CreationalDesignPattern.Prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        Manager manager = new Manager("1", "The Manager");
        Developer developer = new Developer("2", "The Developer");
        developer.setReportsTo(manager);

        Developer anotherDeveloper = (Developer) developer.copy();
        assert anotherDeveloper.getReportsTo() == manager;
    }
}
