package com.anudip.FoodOrderingSystem;

import java.util.Scanner;

public class AddItems {
	static Scanner scanner = new Scanner(System.in);
	
	
	static boolean wantToAddAnotherItem() {
        System.out.println("Do you want to add another item? (yes/no)");
        String continueChoice = scanner.next().toLowerCase();
        return continueChoice.equals("yes");
    }

}
