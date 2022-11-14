package BehavioralDesignPattern.Template;

import java.util.List;

public class OnlineOrder extends OrderTemplate {

    @Override
    public void addItems(List<Item> items) {
        System.out.println("Add items to the virtual cart");
    }

    @Override
    public void dispatch() {
        System.out.println("Order dispatched");
    }

    @Override
    public void doPayment() {
        System.out.println("Make payment for the order");
    }

    @Override
    public void deliver() {
        System.out.println("Order delivered");
    }

    @Override
    public void cancel() {
        System.out.println("Order cancelled");
    }

}
