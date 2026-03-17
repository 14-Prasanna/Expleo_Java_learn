package com.coll;

import java.util.*;

class Mobile implements Comparable<Mobile> {
    private String name;
    private int ram;
    private int price;

    Mobile(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    String getName() {
        return name;
    }

    int getRam() {
        return ram;
    }

    int getPrice() {
        return price;
    }

    void setName(String name) {
        this.name = name;
    }

    void setRam(int ram) {
        this.ram = ram;
    }

    void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Mobile o) {
        return this.ram - o.ram;
    }

    @Override
    public String toString() {
        return name + "\t" + ram + "\t" + price;
    }
}

//public class ComparableDemo {
//
//    public static void main(String args[]) {
////        List<Mobile> ml = new ArrayList<>();
////
////        ml.add(new Mobile("Ram", 8, 800));
////        ml.add(new Mobile("ghgjh", 16, 1800));
////        ml.add(new Mobile("iuaehf", 4, 200));
//    	
//    	Mobile mb1 = new Mobile("RAM", 8, 800);
//    	Mobile mb2 = new Mobile("gqef", 16, 1900);
//    	
//    	mb1.compareTo(mb2);
//
//        
//
//        System.out.println("Name\tRam\tPrice");
//        for (Mobile mb : ml) {
//            System.out.println(mb);
//        }
//    }
//}

public class ComparableDemo {

    public static void main(String args[]) {

        Mobile mb1 = new Mobile("RAM", 8, 800);
        Mobile mb2 = new Mobile("gqef", 8, 1900);

        System.out.println("Comparison Result: " + mb1.compareTo(mb2));
    }
}