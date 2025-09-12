import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() { this(new ArrayList<>()); }

    public Cart(List<Product> products) {
        this.products = products != null ? products : new ArrayList<>();
    }

    public void addProduct(Product p) { if (p != null) products.add(p); }
    public void removeProduct(Product p) { products.remove(p); }
    public int getSize() { return products.size(); }
    public List<Product> getProducts() { return products; }

    public void printCart() {
        if (products.isEmpty()) {
            System.out.println("----Cart is empty");
        } else {
            System.out.println("----Cart contains " + products.size() + " products:");
            for (Product n : products) {
                System.out.println("------" + n);
            }
        }
    }
}