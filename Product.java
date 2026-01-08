class Product {

    private String name;
    private double price;

    static String store = "General Store";

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    Product(String n) {
        name = n;
        price = 0.0;
    }

    Product(String n, double p) {
        name = n;
        price = p;
    }

    static void changeStore(String newStore) {
        store = newStore;
    }

    void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    void applyDiscount(int amount) {
        price = price - amount;
    }

    boolean isCheaperThan(Product p) {
        return price < p.price;
    }

    void show() {
        System.out.println("Store: " + store);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Product.changeStore("Tech World");

        Product p1 = new Product("Laptop", 1000);
        Product p2 = new Product("Headphones");
        p2.setPrice(50);

        p1.applyDiscount(10.0);
        p2.applyDiscount(5);

        System.out.println("Is Headphones cheaper than Laptop? "
                + p2.isCheaperThan(p1));

        System.out.println();

        p1.show();
        p2.show();
    }
}
