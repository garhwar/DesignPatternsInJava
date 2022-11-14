package StructuralDesignPattern.Composite;

public class CompositeDemo {

    public static void main(String args[]){
        Employee dev1 = new Developer("1","Dev1");
        Employee dev2 = new Developer("2","Dev2");
        Employee manager = new Manager("3","Manager");

        manager.add(dev1);
        manager.add(dev2);
        manager.getEmployeeDetails();
    }
    
}
