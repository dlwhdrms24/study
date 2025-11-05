package collection.map.test.cart;

import java.util.Objects;

public class Product {
    private String product;
    private int price;

    public Product(String product, Integer price) {
        this.product = product;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return Objects.equals(product, product1.product) && Objects.equals(price, product1.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}
