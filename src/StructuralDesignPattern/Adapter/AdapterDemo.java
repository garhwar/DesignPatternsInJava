package StructuralDesignPattern.Adapter;

public class AdapterDemo {

    public static void main(String args[])
    {
        OnlinePaymentOrder onlinePaymentOrder = new OrderA();
//        OfflinePaymentOrder offlinePaymentOrder = new OfflinePaymentOrder();

        OfflinePaymentOrder onlinePaymentAdapter = new OnlinePaymentOrderAdapter(onlinePaymentOrder);

        onlinePaymentAdapter.deliver();
    }
}
