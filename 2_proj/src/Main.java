public class Main {
    public static void main(String[] args) {

        User charlie = OnlineStore.registerUser("Charlie");

        charlie.addProduct(new Product("Tablet", "Apple", 900, "USA"));
        charlie.addProduct(new Product("Tablet1", "diia", 1200, "Ukraine"));
        charlie.addProduct(new Product("Tablet2", "Apple", 300, "China"));
        charlie.addProduct(new Product("Tablet3", "Lenovo", 900, "USA"));
        charlie.addProduct(new Product("Tablet4", "LG", 500, "USA"));
        charlie.addProduct(new Product("Tablet5", "Apple", 1900, "USA"));
        charlie.addProduct(new Product("Tablet6", "Apple", 200, "USA"));


        User diana = OnlineStore.registerUser("Diana");

        System.out.println();
        OnlineStore.printDetails();


        System.out.println("---Total products in all carts: " + OnlineStore.countAllProducts());
    }
}