package BehavioralDesignPattern.ChainOfResponsibility;

public class JwtAuth extends Authenticate {

    public JwtAuth(Authenticate next) {
        super(next);
    }

    @Override
    public boolean isAuthorized(String authType) {
        if (authType == "JWT")
            return true;
        else if (authType != null)
            return this.next.isAuthorized(authType);
        return false;
    }
}
