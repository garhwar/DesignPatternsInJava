package StructuralDesignPattern.Facade;

public class AdminUser implements User {
        public String getRoles()
        {
            AdminRole adminRole = new AdminRole();
            return adminRole.getRole();
        }
}
