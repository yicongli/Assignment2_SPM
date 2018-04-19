package Controller;

import View.viewMenus;
import Model.Customer;
import View.viewLogin;
import View.viewManager;
import View.viewCustomer;
import Model.Bike;
import View.viewProduct;
import Model.ElectricBike;
import Model.Product;
import Model.ProductDatabase;
import java.util.ArrayList;


import Model.CustomerDatabase;

	public class ControllerMenus {
		
		public ControllerMenus() {
		}
		
		//StartMenu
		private static viewMenus startMenu = new viewMenus();
		private static Customer myCustomer = new Customer();
		private static viewLogin myLogin = new viewLogin();
		private static viewManager myManager = new viewManager();
		
		public void startMenu() {
		int start = startMenu.startMenu();
		boolean firstMenu = true;
		while (firstMenu)  {
			switch (start){ 		
			case 1: 
				myCustomer = viewCustomer.getCustomerDetails(); 
				myCustomer.writetoFile();
				choiceMenu();
				firstMenu = false;
			    break;
			case 2: 
				if (myLogin.login())
				choiceMenu(); 
				firstMenu = false;
				break;								
			case 9: 
				if (myManager.managerLogin());
				managerMenu();    
				firstMenu = false;
				break;	
			default : 	
				System.out.println("You have put an invalid choice!");
				firstMenu = true; 
			}	
		}	
	}	
		
		//ChoiceMenu
		private static viewMenus choiceMenu = new viewMenus();
		private static ProductDatabase productCatalogue = new ProductDatabase();
		ArrayList<Product> productList = productCatalogue.getDatabase();
		
		 //ChoiceMenu - Customer Main Menu
		public void choiceMenu() {			
		int choice = choiceMenu.choiceMenu();
		boolean secondMenu = true;
		while (secondMenu) {
			switch (choice) {
			case 1:  
				viewProduct.productHeader();
				viewProduct.printBike(productList);
				ControllerProduct.getBooking();
                secondMenu = false;                    
                break;	
			case 2:  
				viewProduct.productHeader2();
                viewProduct.printElectricBike(productList);
                ControllerProduct.getBooking();
                secondMenu = false;                    
                break;
			case 3: 
				System.out.println("We hope you enjoyed the ride! Please lock bike with code 3425!");
				choiceMenu();
				secondMenu = false;                    
				break;
			case 4: 
				System.out.println("Have a great day and see you later!  ");
				System.exit(0);
			default : 
				System.out.println("You have put an invalid choice");
				}	
			}
		}
		
		//ManagerMenu
		private static Bike myBicycle = new Bike();
		private static ElectricBike myElBike = new ElectricBike();
		private static viewMenus managerMenu = new viewMenus();
		private static CustomerDatabase customerList = new CustomerDatabase();
		ArrayList<Customer> CustomerCatalouge = customerList.getDatabase();
		
		public void managerMenu() {
			int manager = managerMenu.managerOutMenu();
	        boolean managerMenu = true;
	        while (managerMenu){
	            switch (manager) {
	                case 1:
	                	myBicycle = viewManager.addBikeDetails();
	                	myBicycle.writetoBikeFile();
	                	managerMenu();
	                	managerMenu = false;
	                    break;
	                case 2:
	                	myElBike = viewManager.addElectricBikeDetails();
	                	myElBike.writetoElBikeFile();
	                	managerMenu();
	                	managerMenu = false;
	                    break;
	                case 3:
	                	System.out.println("Customers database:   ");
	                	viewCustomer.printCustomerDetails(CustomerCatalouge);
	                	managerMenu();
	                	managerMenu = false;
	                    break;
	                case 4:
	                	choiceMenu();
	   				 	managerMenu = false;
	                    break;
	                case 5:
	                    System.out.println("Have a great day and see you later!  ");
	                	System.exit(0);
	                default: 
	                	System.out.println("You have put an invalid choice");
	                	managerMenu = false;
	                    break;
	            	}
	        	}
	      	}	
	}
