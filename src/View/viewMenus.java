package View;

import java.util.Scanner;

public class viewMenus {
	
	public viewMenus() {
	}
	
	public int startMenu() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈"); 
		System.out.println("      	                             	              "); 
		System.out.println("            ≈≈≈≈ WELCOME TO JAVA BIKES ≈≈≈≈	          "); 
		System.out.println("                                                      ");
		System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈\n");
		System.out.println("	Please enter your choice:						  "); 
		System.out.println("	1.  Register as new user            			  "); 
		System.out.println("	2.  Login                    				  	  ");
		System.out.println("	--------------------------						  "); 
		System.out.println("	9. Manager Login								  \n"); 
		System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈\n");
		
		int start = input.nextInt();
		return start; 
		}
	
	public int choiceMenu() {
		Scanner input = new Scanner(System.in);
		System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈\n");
		System.out.println(" 	Please enter your choice: 						 \n");
		System.out.println("	1. View available Bicycles                     	  "); 
		System.out.println("	2. View available Electrical Bikes            	  "); 
		System.out.println("	3. Return a Bicycle                               ");
		System.out.println("	4. Quit the application                           ");
		System.out.println("													  "); 
		System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈\n\n");
		
		int choice = input.nextInt();
		
		return choice; 
		
		}
	
	public int managerOutMenu() {
		Scanner input = new Scanner(System.in);
		System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈\n");
		System.out.println(" 	Please enter your choice: 						 \n");
		System.out.println("	1. Add Bicycles to Database				          "); 
		System.out.println("	2. Add Electric Bike to Database		   	      ");
		System.out.println("	3. Customer Database 	                          ");
		System.out.println("	4. View Customer Menu 							  ");
		System.out.println("	5. Quit the application 						  ");
		System.out.println("													  "); 
		System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈\n\n");
		
		int manager = input.nextInt();
		
		return manager; 
		
		}

}