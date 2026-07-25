import java.util.*;

public class Shoppingcart {
    static void main(String[] args) {
        HashMap<Integer, String> products = new HashMap<>();
        ArrayList<Integer> cart = new ArrayList<>();
        products.put(1, "Laptop - 50000");
        products.put(2, "Mobile - 20000");
        products.put(3, "Headphones - 1500");
        cart.add(1);
        cart.add(3);
        System.out.println("Shopping Cart:");
        for (int id : cart) {
            System.out.println(products.get(id));
        }
        cart.remove(Integer.valueOf(3));
        System.out.println("\nAfter Removing Product:");
        for (int id : cart) {
            System.out.println(products.get(id));
        }
        int total = 0;

        for (int id : cart) {
            String product = products.get(id);
            String[] details = product.split(" _ ");
            int price = Integer.parseInt(details[1]);
            total = total + price;
        }
        System.out.println("\nTotal Bill: " + total);
    }
}