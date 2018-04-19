package View;

import java.util.*;

import Controller.ControllerProduct;
import Model.Bike;
import Model.ElectricBike;
import Model.Product;
import Model.ProductDatabase;

public class viewManager {
	
		public viewManager(){
			}

		public boolean managerLogin(){
		
			Scanner input = new Scanner(System.in);
			String keyword = "123";
			
			 boolean managerKey = false;
	       
			System.out.println("Type in your password: "); 
			String variable = input.nextLine();
			
           if(variable.equals(keyword)) {
        	 System.out.println("\nYou are logged in!");
        	 managerKey = true;
           	}
	       
           else if (!(variable.equals(keyword))) {
                System.out.println("try again");
                managerKey = false;
                managerLogin();
           }
            return managerKey; 
			}
			
		public static Bike addBikeDetails() {
	        Scanner input = new Scanner(System.in);
	        String details;
	        int det;
	        Bike ProductBike = new Bike();
	       	        
		        System.out.print("Type: " ); 
	            details = input.nextLine(); 
	            ProductBike.setType(details);
	                
	            System.out.print("Name: " ); 
	            details = input.nextLine(); 
	            ProductBike.setName(details);
	            
	            System.out.print("Price: " ); 
	            details = input.nextLine(); 
	            ProductBike.setPrice(details);
	            
	            System.out.print("Location: " ); 
	            details = input.nextLine(); 
	            ProductBike.setLocation(details);
	           
	            System.out.print("Gear: " ); 
	            details = input.nextLine(); 
	            ProductBike.setGear(details);
	            
	            System.out.println("\nYou have now registered a new Bicylce! ");
	    
	            return ProductBike;
				}
		
		public static ElectricBike addElectricBikeDetails() {
	        Scanner input = new Scanner(System.in);
	        String details;
	        ElectricBike ProductElBike = new ElectricBike();
	        
		        System.out.print("Type: " ); 
	            details = input.nextLine(); 
	            ProductElBike.setType(details);
	                
	            System.out.print("Name: " ); 
	            details = input.nextLine(); 
	            ProductElBike.setName(details);
	            
	            System.out.print("Price: " ); 
	            details = input.nextLine(); 
	            ProductElBike.setPrice(details);
	            
	            System.out.print("Location: " ); 
	            details = input.nextLine(); 
	            ProductElBike.setLocation(details);
	           
	            System.out.print("BatteryTime: " ); 
	            details = input.nextLine(); 
	            ProductElBike.setBatteryTime(details);
	            
	            System.out.println("\nYou have now registered a new Elextric Bike! ");

	            return ProductElBike;
			}
		
}




		

