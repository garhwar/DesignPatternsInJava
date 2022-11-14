package StructuralDesignPattern.Facade;

public class NonAdminRole implements Role {

    private static final String NON_ADMIN_ROLE = "NOT_AN_ADMIN";

    public NonAdminRole() {
    }

    @Override
    public String getRole() {
        return NON_ADMIN_ROLE;
    }
}
