package product_cart;

import java.util.*;

// ================= PRODUCT CLASS =================
class Product {

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductDetails() {
        return "ID: " + productId +
               " | Name: " + productName +
               " | Price: " + price +
               " | Quantity: " + quantity +
               " | Total: " + calculateTotal();
    }

    public void setQuantity(int newQty) {
        if (newQty >= 0) {
            this.quantity = newQty;
        } else {
            System.out.println("Invalid Quantity!");
        }
    }

    public double calculateTotal() {
        return price * quantity;
    }
}

// ================= CART CLASS =================
class Cart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product Added to Cart Successfully!");
    }

    public void removeProduct(int productId) {
        boolean removed = false;

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            if (p.getProductId() == productId) {
                iterator.remove();
                removed = true;
                System.out.println("Product Removed Successfully!");
                break;
            }
        }

        if (!removed) {
            System.out.println("Product Not Found!");
        }
    }

    public double calculateCartTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.calculateTotal();
        }
        return total;
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Cart is Empty!");
            return;
        }

        System.out.println("\n========== CART DETAILS ==========");
        for (Product p : products) {
            System.out.println(p.getProductDetails());
        }
        System.out.println("----------------------------------");
        System.out.println("Cart Total: " + calculateCartTotal());
        System.out.println("==================================\n");
    }
}

// ================= MAIN CLASS =================
public class Product_Management {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();
        int choice;

        do {
            System.out.println("===== PRODUCT CART MANAGEMENT =====");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Cart");
            System.out.println("4. Calculate Cart Total");
            System.out.println("5. Exit");
            System.out.print("Choose Option: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    Product product = new Product(id, name, price, qty);
                    cart.addProduct(product);
                    break;

                case 2:
                    System.out.print("Enter Product ID to Remove: ");
                    int removeId = sc.nextInt();
                    cart.removeProduct(removeId);
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    System.out.println("Total Cart Amount: " + cart.calculateCartTotal());
                    break;

                case 5:
                    System.out.println("Exiting Application...");
                    break;

                default:
                    System.out.println("Invalid Option!");
            }

        } while (choice != 5);

        sc.close();
    }
}