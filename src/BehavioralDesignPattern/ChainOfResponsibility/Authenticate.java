package BehavioralDesignPattern.ChainOfResponsibility;

public abstract class Authenticate {

    public Authenticate next;

    public Authenticate(Authenticate next) {
        this.next = next;
    }

    public abstract boolean isAuthorized(String authType);
}
