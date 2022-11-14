package StructuralDesignPattern.Adapter;

public class OnlinePaymentOrderAdapter implements OfflinePaymentOrder {

    private OnlinePaymentOrder onlinePaymentOrder;

    public OnlinePaymentOrderAdapter(OnlinePaymentOrder onlinePaymentOrder) {
        this.onlinePaymentOrder = onlinePaymentOrder;
    }

    @Override
    public boolean cashOnDelivery() {
        return onlinePaymentOrder.upi();
    }

    public void dispatch() {
        onlinePaymentOrder.dispatch();
    }

    @Override
    public void deliver() {
        onlinePaymentOrder.dispatch();
        assert cashOnDelivery();
        System.out.println("Order delivered");
    }
}
