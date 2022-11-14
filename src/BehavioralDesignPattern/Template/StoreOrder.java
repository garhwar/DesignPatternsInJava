package BehavioralDesignPattern.Template;

import java.util.List;

public class StoreOrder extends OrderTemplate {
    @Override
    public void addItems(List<Item> items) {
        System.out.println("Add items to the physical cart");
    }

    @Override
    public void dispatch() {
        System.out.println("Order dispatch not applicable for store placed orders");
    }

    @Override
    public void doPayment() {
        System.out.println("Make payment for the order");
    }

    @Override
    public void deliver() {
        System.out.println("Order delivery not applicable for store placed orders");
    }

    @Override
    public void cancel() {
        System.out.println("Order cancellation not applicable for store placed orders");
    }
}
