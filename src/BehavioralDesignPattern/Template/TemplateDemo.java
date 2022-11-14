package BehavioralDesignPattern.Template;

public class TemplateDemo {

    public static void main(String[] args) {
        System.out.println("Creating a Store Order with status PLACED");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(Status.PLACED);
        System.out.println();
        System.out.println("Creating an Online Order with status CANCELLED");
        OrderTemplate onlineOrder = new OnlineOrder();
        onlineOrder.processOrder(Status.CANCELLED);
    }

}
