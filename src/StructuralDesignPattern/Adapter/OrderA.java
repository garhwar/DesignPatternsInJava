package StructuralDesignPattern.Adapter;

public class OrderA implements OnlinePaymentOrder {
    @Override
    public boolean netBanking() {
        System.out.println("Processing payment through net banking");
        return true;
    }

    @Override
    public boolean debitCard() {
        System.out.println("Processing payment through debit card");
        return true;
    }

    @Override
    public boolean upi() {
        System.out.println("Processing payment through UPI");
        return true;
    }

    public void dispatch() {
        System.out.println("Dispatching order");
    }

    public void deliver() {
        assert netBanking() || debitCard() || upi();
        dispatch();
        System.out.println("Order delivered");
    }
}
