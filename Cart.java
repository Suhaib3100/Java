import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public String viewCart() {
        if (items.isEmpty()) {
            return "Your cart is empty.";
        } else {
            StringBuilder cartContents = new StringBuilder("Items in your cart:\n");
            for (Item item : items) {
                cartContents.append(item).append("\n");
            }
            return cartContents.toString();
        }
    }

    public double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public String checkout() {
        if (items.isEmpty()) {
            return "Your cart is empty. Nothing to checkout.";
        } else {
            double total = getTotal();
            items.clear();
            return "Total amount: $" + total + "\nThank you for shopping with us!";
        }
    }
}
