package CreationalDesignPattern.Builder;

public class BuilderDemo {

    public static void main(String[] args) {
        Category category = new Category("Footwear");
        Product product1 = new Product();
        product1.setName("Adidas running shoes").setPrice(1000).setCategory(category);
        System.out.println(product1);
    }
}
