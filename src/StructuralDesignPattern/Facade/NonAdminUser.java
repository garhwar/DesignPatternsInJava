package StructuralDesignPattern.Facade;

public class NonAdminUser implements User {

    public String getRoles()
    {
        NonAdminRole nonAdminRole = new NonAdminRole();
        return nonAdminRole.getRole();
    }
}
