
package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Database.TextFileProduct;
import Model.Product;
import View.viewCreditcard;

public class ControllerProduct {

	public ControllerProduct() {	
	}
	
	static ArrayList<Product>productList = TextFileProduct.getAllProductDetails();
	
	// Costumer Input
    public static int getProductChoice() {
	        Scanner input = new Scanner(System.in);
	        System.out.println("\nPlease enter Bike ID to rent a Bike: ");
	        System.out.print("ID: ");
            int number = input.nextInt();
        while(!(number < Product.getCount()) && number >= 0) {
            System.out.println("Invalid product ID or type. Please try again: ");
            System.out.print("ID: ");
            number = input.nextInt();
	    	} 
        	return number;
    	}

     public static  void getBooking() {   
		for(int i = 0; i < productList.size(); i++){
			int n = ControllerProduct.getProductChoice();
		    String converted = Integer.toString(n);
		if(converted.equalsIgnoreCase(productList.get(i).getName()));
			viewCreditcard.myCredictcard();
			System.out.println("\n≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈ Receipt ≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈\n ");
			System.out.println("  	   THANK YOU FOR USING JAVABIKES		 ");
			System.out.print("\nYou have booked:" + productList.get(i).getName());
			System.out.print("\nPrice: " + productList.get(i).getPrice() + " per Hour");
			System.out.println("\nPick-Up Location: " + productList.get(i).getLocation());
			System.out.println("\n≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈\n ");
			System.out.println("		   ENJOY THE RIDE!			 ");
			System.exit(0);
			}
     	}
}
