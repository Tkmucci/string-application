package com.pluralsight;

public class Receipt {

    public static void main(String[] args) {

        //Step 3

        String itemName = "Pineapple";
        double pineapplePrice = 10.99;
        int quantity = 7;

        System.out.println("You bought: " + quantity + " " + itemName + "s for $" + pineapplePrice * quantity);
    }

}
