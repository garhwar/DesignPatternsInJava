package StructuralDesignPattern.Composite;

public  class Developer implements Employee{

    private String id;
    private String name;

    public Developer(String id, String name)  {
        this.id=id;
        this.name = name;
    }

    @Override
    public void add(Employee employee) {
    }


    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println("Id ="+getId());
        System.out.println("Name ="+getName());
    }
}
