package StructuralDesignPattern.Adapter;

public interface OfflinePaymentOrder {
    public boolean cashOnDelivery();
    public void dispatch();
    public void deliver();
}
