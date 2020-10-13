package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class shoppingList {



    ArrayList<shoppingItem> list = new ArrayList<>();
    public void addItem() {
        System.out.println();
        System.out.println("Introdu numele produsului");
        Scanner scanner = new Scanner(System.in);
        String itemName = scanner.nextLine();

        System.out.println("Introdu pretul produsului");
        double itemPrice = scanner.nextDouble();

        System.out.println("De cate ai nevoie?");
        int itemQty = scanner.nextInt();
        shoppingItem Item = new shoppingItem();
        Item.setItemName(itemName);
        Item.setItempPrice(itemPrice);
        Item.setItemQty(itemQty);
        System.out.println("\n" + Item.getItemName() + " " + Item.getItemPrice() + " lei" + " x " + Item.getItemQty() + " bucati = " + Item.getItemTotalPrice());
        list.add(Item);
    }

    public void displayItem() {
        System.out.println("Produse: " + list.size() );
        for (shoppingItem x : list) {
            System.out.println(x.toString());
        }

    }
}