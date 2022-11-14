package BehavioralDesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int status; // 0 or 1
    private List<Product> products = new ArrayList<>();

    public Order(int status, List<Product> products) {
        this.status = status;
        this.products = products;
    }

    public void addObserver(Product product) {
        this.products.add(product);
    }

    public void removeObserver(Product product) {
        this.products.remove(product);
    }

    public void setProducts(int status) {
        this.status = status;
        if (status == 0) {
            System.out.println("Do nothing");
        } // Delivered
        else if(status == 1) // Cancelled
        for (Product product : this.products) {
            product.update(product.getStock() + 1); // Restore the stock, assuming product quantity to be one
        }
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
