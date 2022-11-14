package BehavioralDesignPattern.ChainOfResponsibility;

public class ChainOfResponsibilityDemo {

    public static void main (String[] args)
    {
        Authenticate basicAuth = new BasicAuth(null);
        Authenticate jwtAuth = new JwtAuth(basicAuth);

        assert jwtAuth.isAuthorized("JWT");
        assert jwtAuth.isAuthorized("BASIC");
        assert jwtAuth.isAuthorized("JWTT");

    }
}
