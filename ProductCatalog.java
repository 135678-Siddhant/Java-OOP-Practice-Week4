class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public void displayDetails() {
        System.out.print("Product: " + name + " | Price: $" + price);
    }
}

class Electronics extends Product {
    private int warrantyPeriod; // in months

    public Electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(" | Warranty: " + warrantyPeriod + " months");
    }
}

class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(" | Size: " + size + " | Material: " + material);
    }
}

class Grocery extends Product {
    private String expiryDate;

    public Grocery(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(" | Expires on: " + expiryDate);
    }
}

public class ProductCatalog {
    public static void main(String[] args) {
        Product[] catalog = {
            new Electronics("Laptop", 1200.00, 24),
            new Clothing("Hoodie", 45.00, "XL", "Cotton"),
            new Grocery("Milk", 3.49, "2026-06-30")
        };

        for (Product p : catalog) {
            p.displayDetails();
        }
    }
}