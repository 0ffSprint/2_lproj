import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
    private static List<User> users;

    static {
        users = new ArrayList<>();

        User alice = registerUser("Alice");
        alice.addProduct(new Product("Laptop", "Dell", 1200, "Warehouse A"));
        alice.addProduct(new Product("Mouse", "Logitech", 50, "Warehouse B"));


        User bob = registerUser("Bob");
        bob.addProduct(new Product("Phone", "Samsung", 800, "Warehouse A"));
    }

    public OnlineStore() { this(new ArrayList<>()); }

    public OnlineStore(List<User> users) {
        OnlineStore.users = users != null ? users : new ArrayList<>();
    }

    public static List<User> getUsers() { return users; }
    public static int getUserCount() { return users.size(); }

    public static User registerUser(String userName) {
        User user = new User(userName);
        users.add(user);
        return user;
    }

    public static void printDetails() {
        System.out.println("=== Online Store ===");
        System.out.println("--Total users: " + users.size());
        System.out.println();
        for (User n : users) {
            n.printUsers();
            System.out.println();
        }
        System.out.println("===========END===========\n");
    }

    public static int countAllProducts() {
        int total = 0;
        for (User u : users) {
            total += u.getCart().getSize();
        }
        return total;
    }

}