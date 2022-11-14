package BehavioralDesignPattern.ChainOfResponsibility;

public class BasicAuth extends Authenticate {

    public BasicAuth(Authenticate next) {
        super(next);
    }

    @Override
    public boolean isAuthorized(String authType) {
        if (authType == "BASIC")
            return true;
        else if (authType != null)
            return this.next.isAuthorized(authType);
        return false;
    }
}
