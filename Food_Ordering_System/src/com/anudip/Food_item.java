package com.anudip.Little_hut_hotel;

import java.util.Scanner;

public class Food_item {
	static Scanner sc = new Scanner(System.in);
	
	Hotel_Mattairials hotalMattrial = new Hotel_Mattairials();
	
	static boolean wantToAddAnotherItem() {
        System.out.println("Do you want to add another item? (yes/no)");
        String continueChoice = sc.next().toLowerCase();
        return continueChoice.equals("yes");
    }
	
	public Food_item() {
		
		
		
		
		
		do {
			
			
			
			
			System.out.println("Select the Items: \n1.Starter: \n2.Main Course: \n3.Deserts: \n4.Drinks: \nEnter the Number: ");
			int number = sc.nextInt();
				switch (number) {
				case 1:
					hotalMattrial.starter();
					
					break;
					
				case 2:
					hotalMattrial.mainCourse();
							
					break;
				
							
				case 3:
					
					hotalMattrial.desert();
					
					break;
					
				case 4:
					
					hotalMattrial.drinks();
					
					break;


				default:
					System.out.println("Invalid Input: " + number);
					break;
				}
			
			
		} while (wantToAddAnotherItem());
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Food_item();
	}
	
	

}
