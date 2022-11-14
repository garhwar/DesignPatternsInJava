package StructuralDesignPattern.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {
    private String id;
    private String name;

    public Manager(String id,String name) {
        this.id=id;
        this.name = name;
    }
    List<Employee> employees = new ArrayList<>();
    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String getId()  {
        return id;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void getEmployeeDetails() {
        Iterator<Employee> it = employees.iterator();

        while(it.hasNext())  {
            Employee employee = it.next();
            employee.getEmployeeDetails();
        }
    }
}