package com.company;
import java.util.Scanner;

public class Main {

    public static void main( String [] args) {
        Scanner scanner = new Scanner(System.in);
        shoppingList myList = new shoppingList();
        int userOption = 0;
        while (userOption != 3) {
            System.out.println("----- Lista de cumparaturi------");
            System.out.println("- 1 - Adauga un element in lista. ");
            System.out.println("- 2 - Afiseaza lista de cumparaturi. ");
            System.out.println("- 3 - Pune lista inapoi in buzunar(Quit) =) ");
            userOption = scanner.nextInt();

            if (userOption == 1) {
                myList.addItem();

            }

            if (userOption == 2) {
                myList.displayItem();
            }
        }
    }
}
