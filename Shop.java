package com.company;

import java.util.*;

public class Shop {
    private Map<Integer, Integer> items; // Stores item ID and their quantities
    private Set<Integer> orders; // Stores order IDs to ensure uniqueness

    public Shop() {
        items = new HashMap<>();
        orders = new HashSet<>();
    }

    // Create an item or update its quantity
    public String create(int itemId, int quantity) {
        if (!items.containsKey(itemId) || items.get(itemId) == 0) {
            items.put(itemId, quantity);
            return "Item created successfully"; // New item created
        } else {
            items.put(itemId, items.get(itemId) + quantity); // Increase stock
            return "Item updated successfully"; // Item already exists
        }
    }

    // Place an order
    public String placeOrder(int orderId, int itemId, int quantity) {
        if (!items.containsKey(itemId) || items.get(itemId) < quantity) {
            return "Couldn't place order"; // Item unavailable or insufficient stock
        } else {
            orders.add(orderId); // Add unique order ID
            items.put(itemId, items.get(itemId) - quantity); // Deduct stock
            return "Order placed successfully"; // Order successfully placed
        }
    }

    // Calculate total balance (remaining stock)
    public String balance() {
        int totalQuantity = 0;
        for (int qty : items.values()) {
            totalQuantity += qty;
        }
        return "Total number of items in the shop is: " + totalQuantity; // Return total quantity
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        int Q = sc.nextInt(); // Number of queries
        sc.nextLine(); // Consume the remaining newline

        for (int i = 0; i < Q; i++) {
            if (sc.hasNextLine()) { // Ensure there is a next line to read
                String[] parts = sc.nextLine().split(" ");

                if (parts[0].equals("Create")) {
                    int itemId = Integer.parseInt(parts[1]);
                    int quantity = Integer.parseInt(parts[2]);
                    String result = shop.create(itemId, quantity);
                    System.out.println(result);

                } else if (parts[0].equals("PlaceOrder")) {
                    int orderId = Integer.parseInt(parts[1]);
                    int itemId = Integer.parseInt(parts[2]);
                    int quantity = Integer.parseInt(parts[3]);
                    String result = shop.placeOrder(orderId, itemId, quantity);
                    System.out.println(result);

                } else if (parts[0].equals("Balance")) {
                    String result = shop.balance();
                    System.out.println(result);
                }
            } else {
                System.out.println("No more queries to process."); // Optional message for debugging
                break; // Exit the loop if there are no more lines to read
            }
        }
        sc.close();
    }
}
