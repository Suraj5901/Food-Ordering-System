package com.anudip.Little_hut_hotel;



public class Hotel_Mattairials {
	
//	public Hotel_Mattairials() {
//		
//		starter();
//		mainCourse();
//		desert();
//		drinks();
//		
//		
//
//
//	}
//	
	
public void starter() {
	
	
		
	AddItems vegetable_Pakoras = new AddItems("Vegetable Pakoras", 15.00);
	AddItems samosa = new AddItems("Samosa", 16.00);
	AddItems paneer_Tikka = new AddItems("Paneer Tikka", 20.99);
	AddItems aloo_Tikki = new AddItems("Aloo Tikki", 25.99);
	AddItems gobi_Manchurian = new AddItems("Gobi Manchurian", 30.99);
	AddItems dahi_Puri = new AddItems("Dahi Puri", 20.99);
	AddItems hara_Bhara_Kabab = new AddItems("Hara Bhara Kabab", 30.99);
	AddItems onion_Bhaji = new AddItems("Onion Bhaji", 15.99);
		
		
	}
	
public void mainCourse() {
		
			AddItems dal_Makhani = new AddItems("Dal Makhani", 45.99);
			AddItems palak_Paneer = new AddItems("Palak Paneer", 60.99);
			AddItems chana_Masalan = new AddItems("Chana Masala", 70.99);
			AddItems aloo_Gobi = new AddItems("Aloo Gobi", 30.99);
			AddItems baingan_Bharta = new AddItems("Baingan Bharta", 45.99);
			AddItems malai_Kofta = new AddItems("Malai Kofta", 70.99);
			AddItems vegetable_Biryani = new AddItems("Vegetable Biryani", 60.99);
			AddItems methi_Matar_Malai = new AddItems("Methi Matar Malai", 60.99);
			AddItems rajma_Masala = new AddItems("Rajma Masala", 65.99);
			AddItems aloo_Jeera = new AddItems("Aloo Jeera", 30.99);
			
		}
public void desert() {
		
		AddItems gulab_Jamun = new AddItems("Gulab Jamun", 25.99);
		AddItems rasmalai = new AddItems("Rasmalai", 30.99);
		AddItems kheer = new AddItems("Kheer", 30.99);
		AddItems gajar_Halwa = new AddItems("Gajar Halwa", 45.99);
		AddItems rasgulla = new AddItems("Rasgulla", 50.99);
		AddItems malpua = new AddItems("Malpua", 60.99);
		AddItems kulfi = new AddItems("Kulfi", 30.99);
		AddItems jalebi = new AddItems("Jalebi", 45.99);
		AddItems coconut_Ladoo = new AddItems("Coconut Ladoo", 25.99);
		AddItems peda = new AddItems("Peda", 60.99);
		
	}
public void drinks() {
		
			AddItems masala_Chai = new AddItems("Masala Chai", 15.99);
			AddItems lassi = new AddItems("Lassi ", 20.49);
			AddItems mango_Shake = new AddItems("Mango Shake ", 25.49);
			AddItems badam_Milk = new AddItems("Badam Milk ", 30.49);
			AddItems jal_Jeera  = new AddItems("Jal Jeera  ", 20.49);
			AddItems rose_Sherbet = new AddItems("Rose Sherbet ", 25.49);
			AddItems thandai = new AddItems("Thandai ", 30.49);
			AddItems nimbu_Pani = new AddItems("Nimbu Pani ", 15.49);
			AddItems aam_Panna = new AddItems("Aam Panna ", 30.49);
			AddItems coconut_Water = new AddItems("Coconut Water ", 40.49);
		
}
	
	public static void main(String[] args) {
		new Hotel_Mattairials();
	}

}
