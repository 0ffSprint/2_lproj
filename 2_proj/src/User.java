public class User {
    private static int idGen = 0;
    private final int userId;
    private final String userName;
    private final Cart cart = new Cart();

    public User(String userName) { this(++idGen, userName); }

    public User(int userId, String userName) {
        if (userName == null || userName.isBlank()) throw new IllegalArgumentException("userName is required");
        this.userId = userId;
        this.userName = userName;
    }

    public void addProduct(Product p) { cart.addProduct(p); }
    public void removeProduct(Product p) { cart.removeProduct(p); }

    public int getUserId() { return userId; }
    public String getUserName() { return userName; }
    public Cart getCart() { return cart; }

    public double getTotalPrice() {
        double total = 0;
        for (Product n : cart.getProducts()) {
            total += n.getPrice();
        }
        return total;
    }

    public void printUsers() {
        System.out.println("--User ID: " + userId + ", Name: " + userName);
        cart.printCart();
        System.out.printf("----Total cart value: $%.2f%n", getTotalPrice());
    }
}