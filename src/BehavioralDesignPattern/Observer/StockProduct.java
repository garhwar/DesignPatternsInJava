package BehavioralDesignPattern.Observer;

public class StockProduct implements Product {
    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void update(int stock) {
        this.setStock(stock);
    }

}