package View;

import java.util.ArrayList;
import Model.Bike;
import Model.ElectricBike;
import Model.Product;

public class viewProduct {

		public viewProduct(){ //constructor 
		}
			
		public static void printBike(ArrayList<Product> list) {
			
			for (Product product: list) {
			if (product instanceof Bike)
			System.out.println(product);
			}
		}
			
		public static void printElectricBike(ArrayList<Product> list) {
			for (Product product: list){
			if (product instanceof ElectricBike)
			System.out.println(product);
			}
		}
		
		public static void productHeader() {
		System.out.println("Avaliable Bicycles: \n");
	    System.out.printf("%-11s %-18s %-18s %-18s %-18s %-18s %n", "Bike ID", "Type", "Model", "Price/h", "Location", "Gear");
		}
		
		public static void productHeader2() {
		System.out.println("Available Electric Bikes: \n");
		System.out.printf("%-11s %-18s %-18s %-18s %-18s %-18s %n", "El-Bike ID", "Type", "Model", "Price/h", "Location", "Battery");
		}

}