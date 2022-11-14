package BehavioralDesignPattern.Template;

import java.util.List;

public abstract class OrderTemplate {

    protected List<Item> items;

    protected Status status;

    public abstract void addItems(List<Item> items);

    public abstract void dispatch();

    public abstract void doPayment();

    public abstract void deliver();

    public abstract void cancel();

    public final void processOrder(Status status) {
        if (status.equals(Status.PLACED)) {
            doPayment();
            dispatch();
        }
        else if(status.equals(Status.DELIVERED)) {
            doPayment();
            dispatch();
            deliver();
        }

        else if (status.equals(Status.CANCELLED)) {
            cancel();
        }
    }
}
