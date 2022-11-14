package StructuralDesignPattern.Facade;

public class GetUserRoles {

    public String getAdminRoles()
    {
        AdminUser adminUser = new AdminUser();
        return adminUser.getRoles();
    }

    public String getNonAdminRoles()
    {
        NonAdminUser nonAdminUser = new NonAdminUser();
        return nonAdminUser.getRoles();
    }
}
