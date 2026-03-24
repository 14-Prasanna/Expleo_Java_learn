package com.collections;

import java.util.*;

class Product {
    int productId;
    String productName;
    String productCategory;
    double productPrice;
    double productDiscount;
    double productQuantity;

    Product(int id, String name, String cat, double price, double dis, double qun) {
        this.productId = id;
        this.productName = name;
        this.productPrice = price;
        this.productDiscount = dis;
        this.productCategory = cat;
        this.productQuantity = qun;
    }

   
    public String toString() {
        return productId + " " + productName + " " + productCategory + " " + productPrice;
    }
}

public class P4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> l1 = new ArrayList<>();

        
        l1.add(new Product(101, "iphone10", "Mobile", 50000.0, 0.2, 2));
        l1.add(new Product(102, "Dell", "Mobile", 20000.0, 0.3, 4));
        l1.add(new Product(103, "iphone13", "Mobile", 110000.0, 0.5, 1));
        l1.add(new Product(104, "Lenovo", "Laptop", 70000.0, 0.8, 3));
        l1.add(new Product(105, "iphone12", "Mobile", 10000.0, 0.5, 3));
        l1.add(new Product(106, "Nothing", "Mobile", 22000.0, 0.6, 1));

        while (true) {
            System.out.println("\n1. Sort by Id");
            System.out.println("2. List price more than 40000");
            System.out.println("3. Exit");

            System.out.print("Enter option: ");
            int a = sc.nextInt();

            switch (a) {
                case 1:
                    
                    Collections.sort(l1, Comparator.comparingInt(p -> p.productId));
                    l1.forEach(System.out::println);
                    break;

                case 2:
                    
                    for (Product p : l1) {
                        if (p.productPrice > 40000) {
                            System.out.println(p);
                        }
                    }
                    break;

                default :
                    System.out.println("Exit, Thank you");
                    sc.close();
                    return; 

            }
        }
    }
}