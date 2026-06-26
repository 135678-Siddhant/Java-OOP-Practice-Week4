import java.util.Arrays;

class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public void displayMenuItem() {
        System.out.print(name + " - $" + price);
    }
}

class Pizza extends FoodItem {
    private String size;
    private String[] toppings;

    public Pizza(String name, double price, String size, String[] toppings) {
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }

    @Override
    public void displayMenuItem() {
        super.displayMenuItem();
        System.out.println(" (" + size + " Pizza with toppings: " + Arrays.toString(toppings) + ")");
    }
}

class Burger extends FoodItem {
    private boolean hasCheese;
    private String pattyType;

    public Burger(String name, double price, boolean hasCheese, String pattyType) {
        super(name, price);
        this.hasCheese = hasCheese;
        this.pattyType = pattyType;
    }

    @Override
    public void displayMenuItem() {
        super.displayMenuItem();
        System.out.println(" (" + pattyType + " burger, Cheese: " + (hasCheese ? "Yes" : "No") + ")");
    }
}

class Salad extends FoodItem {
    private String[] ingredients;

    public Salad(String name, double price, String[] ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    @Override
    public void displayMenuItem() {
        super.displayMenuItem();
        System.out.println(" (Fresh green salad mixed with: " + Arrays.toString(ingredients) + ")");
    }
}

public class FoodOrderApp {
    public static void main(String[] args) {
        FoodItem pizza = new Pizza("Pepperoni Flame", 14.99, "Large", new String[]{"Pepperoni", "Jalapenos", "Mozzarella"});
        FoodItem burger = new Burger("Classic Stack", 8.49, true, "Angus Beef");

        pizza.displayMenuItem();
        burger.displayMenuItem();
    }
}
