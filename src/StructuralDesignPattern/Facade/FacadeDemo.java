package StructuralDesignPattern.Facade;

public class FacadeDemo {

    public static void main (String[] args)
    {
        GetUserRoles userRoles = new GetUserRoles();

        String adminUser = userRoles.getAdminRoles();
        System.out.println(adminUser);
        String nonAdminUser = userRoles.getNonAdminRoles();
        System.out.println(nonAdminUser);

    }
}
