package StructuralDesignPattern.Facade;

public class AdminRole implements Role {

    private static final String ADMIN_ROLE = "ADMIN";

    public AdminRole() {
    }

    @Override
    public String getRole() {
        return ADMIN_ROLE;
    }
}
