package StructuralDesignPattern.Adapter;

public interface OnlinePaymentOrder {
    public boolean netBanking();
    public boolean debitCard();
    public boolean upi();
    public void dispatch();
    public void deliver();
}
