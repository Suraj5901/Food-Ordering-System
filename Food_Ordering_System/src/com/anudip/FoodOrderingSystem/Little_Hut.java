package com.anudip.FoodOrderingSystem;

import java.util.Scanner;

public class Little_Hut {
	
	 private static Scanner scanner = new Scanner(System.in);
	 private static double totalAmount = 0.0;
	
	
	
	private static Food_Items takeOrder(String category, Food_Items... items) {
        System.out.println("Select an item from " + category + ":");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ": " + items[i].getName() + " - $" + items[i].getPrice());
        }

        int itemChoice = scanner.nextInt();
        if (itemChoice > 0 && itemChoice <= items.length) {
            return items[itemChoice - 1];
        } else {
            System.out.println("Invalid item choice. Please select a valid item.");
            return takeOrder(category, items);
        }
    }
	
	
	
	
	
	
	
	  

	public static void main(String[] args) {

		System.out.println("Welcome to Little Hut Hotel!!\n\n\n\n");
		
		System.out.println("This is Pure Veg Hotel !!\n\n\n");
		
		System.out.println("List Of Menu Items Available!! \n\n\n");
		
		new MenuItems();
		
		
		   // Create food items
        Food_Items vegetable_Pakoras = new Food_Items("Vegetable Pakoras", 15.00);
        Food_Items samosa = new Food_Items("Samosa", 16.00);
        Food_Items paneer_Tikka = new Food_Items("Paneer Tikka", 20.99);
        Food_Items aloo_Tikki = new Food_Items("Aloo Tikki", 25.99);
        Food_Items gobi_Manchurian = new Food_Items("Gobi Manchurian", 30.99);
        Food_Items dahi_Puri = new Food_Items("Dahi Puri", 20.99);
        Food_Items papdi_Chaat = new Food_Items("Papdi Chaat", 11.99);
        Food_Items hara_Bhara_Kabab = new Food_Items("Hara Bhara Kabab", 30.99);
        Food_Items chilli_Paneer = new Food_Items("Chilli Paneer", 20.99);
        Food_Items onion_Bhaji = new Food_Items("Onion Bhaji", 15.99);
        
        
        
        /*
         * 
         * Vegetable Pakoras - Assorted fritters made with mixed vegetables and chickpea flour.
Samosa - Deep-fried pastry filled with spiced potatoes and peas.
Paneer Tikka - Grilled cottage cheese cubes marinated in yogurt and spices.
Aloo Tikki - Spiced potato patties served with chutneys and yogurt.
Gobi Manchurian - Cauliflower florets coated in a tangy and spicy sauce.
Dahi Puri - Crispy hollow puris filled with chickpeas, potatoes, and yogurt.
Papdi Chaat - Crispy flour crisps topped with potatoes, chutneys, and spices.
Hara Bhara Kabab - Green vegetable and spinach kebabs.
Chilli Paneer - Stir-fried paneer (cottage cheese) with onions and bell peppers.
Onion Bhaji - Deep-fried onion fritters.
         * 
         * 
         * 
         * */

        Food_Items dal_Makhani = new Food_Items("Dal Makhani", 45.99);
        Food_Items palak_Paneer = new Food_Items("Palak Paneer", 60.99);
        Food_Items chana_Masalan = new Food_Items("Chana Masala", 70.99);
        Food_Items aloo_Gobi = new Food_Items("Aloo Gobi", 30.99);
        Food_Items baingan_Bharta = new Food_Items("Baingan Bharta", 45.99);
        Food_Items malai_Kofta = new Food_Items("Malai Kofta", 70.99);
        Food_Items vegetable_Biryani = new Food_Items("Vegetable Biryani", 60.99);
        Food_Items methi_Matar_Malai = new Food_Items("Methi Matar Malai", 60.99);
        Food_Items rajma_Masala = new Food_Items("Rajma Masala", 65.99);
        Food_Items aloo_Jeera = new Food_Items("Aloo Jeera", 30.99);
        
        
        /*
         * Dal Makhani - Creamy black lentils slow-cooked with spices and butter.
Palak Paneer - Cottage cheese cubes cooked in a spinach-based gravy.
Chana Masala - Spiced chickpeas cooked in a flavorful tomato-based sauce.
Aloo Gobi - Potatoes and cauliflower cooked with Indian spices.
Baingan Bharta - Smoky mashed eggplant cooked with onions and tomatoes.
Malai Kofta - Paneer and potato dumplings served in a rich, creamy sauce.
Vegetable Biryani - Fragrant rice cooked with mixed vegetables and aromatic spices.
Methi Matar Malai - Fenugreek and green peas cooked in a creamy sauce.
Rajma Masala - Kidney beans cooked in a spiced tomato gravy.
Aloo Jeera - Cumin-flavored sautéed potatoes.
         * 
         * 
         * */

        Food_Items gulab_Jamun = new Food_Items("Gulab Jamun", 25.99);
        Food_Items rasmalai = new Food_Items("Rasmalai", 30.99);
        Food_Items kheer = new Food_Items("Kheer", 30.99);
        Food_Items gajar_Halwa = new Food_Items("Gajar Halwa", 45.99);
        Food_Items rasgulla = new Food_Items("Rasgulla", 50.99);
        Food_Items malpua = new Food_Items("Malpua", 60.99);
        Food_Items kulfi = new Food_Items("Kulfi", 30.99);
        Food_Items jalebi = new Food_Items("Jalebi", 45.99);
        Food_Items coconut_Ladoo = new Food_Items("Coconut Ladoo", 25.99);
        Food_Items peda = new Food_Items("Peda", 60.99);
        
        
        /*
         * Gulab Jamun - Soft and syrup-soaked milk dumplings.
Rasmalai - Soft paneer dumplings served in sweetened milk.
Kheer - Traditional rice pudding flavored with cardamom and nuts.
Gajar Halwa - Carrot pudding with milk and dry fruits.
Rasgulla - Spongy cheese balls served in sugar syrup.
Malpua - Sweet and fluffy pancakes served with rabri.
Kulfi - Creamy and frozen Indian dessert available in various flavors.
Jalebi - Deep-fried pretzel-like dessert soaked in sugar syrup.
Coconut Ladoo - Sweet coconut and condensed milk balls.
Peda - Milk-based sweet confections, often flavored with cardamom.
         * */

        Food_Items masala_Chai = new Food_Items("Masala Chai", 15.99);
        Food_Items lassi = new Food_Items("Lassi ", 20.49);
        Food_Items mango_Shake = new Food_Items("Mango Shake ", 25.49);
        Food_Items badam_Milk = new Food_Items("Badam Milk ", 30.49);
        Food_Items jal_Jeera  = new Food_Items("Jal Jeera  ", 20.49);
        Food_Items rose_Sherbet = new Food_Items("Rose Sherbet ", 25.49);
        Food_Items thandai = new Food_Items("Thandai ", 30.49);
        Food_Items nimbu_Pani = new Food_Items("Nimbu Pani ", 15.49);
        Food_Items aam_Panna = new Food_Items("Aam Panna ", 30.49);
        Food_Items coconut_Water = new Food_Items("Coconut Water ", 40.49);
        
        
        /*
         * Masala Chai - Spiced Indian tea made with milk and aromatic spices.
Lassi - Traditional yogurt-based drink, available in sweet or salty variations.
Mango Shake - Thick mango smoothie made with fresh mango pulp and milk.
Badam Milk - Almond-flavored milk served hot or cold.
Jal Jeera - Refreshing cumin and mint-flavored drink.
Rose Sherbet - Sweet and fragrant rose-flavored drink.
Thandai - Cooling drink made with nuts, milk, and spices.
Nimbu Pani - Classic lemonade with a hint of Indian spices.
Aam Panna - Raw mango drink with mint and spices.
Coconut Water - Fresh coconut water, a natural and hydrating choice.
         * 
         * */
        
        String name = null;
        
        // Take order
        do {
            System.out.println("Select category: ");
            System.out.println("1: Starters");
            System.out.println("2: Main Course");
            System.out.println("3: Desserts");
            System.out.println("4: Drinks");
            System.out.println("Enter Your Choice: ");

            int categoryChoice = scanner.nextInt();

            Food_Items selectedItem = null;
            switch (categoryChoice) {
                case 1:
                    selectedItem = takeOrder("Starters", vegetable_Pakoras, samosa, paneer_Tikka, aloo_Tikki, gobi_Manchurian, dahi_Puri, papdi_Chaat, hara_Bhara_Kabab, chilli_Paneer, onion_Bhaji);
                    break;
                case 2:
                    selectedItem = takeOrder("Main Course", dal_Makhani, palak_Paneer, chana_Masalan, aloo_Gobi, baingan_Bharta, malai_Kofta, vegetable_Biryani, methi_Matar_Malai, rajma_Masala, aloo_Jeera );
                    break;
                case 3:
                    selectedItem = takeOrder("Desserts", gulab_Jamun, rasmalai, kheer, gajar_Halwa, rasgulla, malpua, kulfi, jalebi,coconut_Ladoo, peda);
                    break;
                case 4:
                    selectedItem = takeOrder("Drinks", masala_Chai, lassi, mango_Shake,badam_Milk, jal_Jeera, rose_Sherbet, thandai, nimbu_Pani, aam_Panna, coconut_Water);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid category.");
                    continue;
            }
            name = selectedItem.getName();
            totalAmount += selectedItem.getPrice();
            System.out.println(totalAmount);
            System.out.println(name+ " added to your order. Current total: $" + totalAmount);
            
             new AddItems();
//            addItems.wantToAddAnotherItem();
        }
       
        
        while (AddItems.wantToAddAnotherItem());

        System.out.println(name+"Your order total is $" + totalAmount);
        System.out.println("Thank you for ordering!");
        scanner.close();
    }
		

	

}
