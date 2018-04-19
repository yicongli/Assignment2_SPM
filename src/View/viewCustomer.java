package View;

import java.util.ArrayList;
import java.util.Scanner;
import Model.Customer;

	public class viewCustomer {

	public viewCustomer(){
		}
		
		public static Customer getCustomerDetails() {
	        Scanner input = new Scanner(System.in);
	        String details;
	        Customer customer1 = new Customer();
	                
            System.out.print("First name: " ); 
            details = input.nextLine(); 
            while (!(details.matches("^[a-zA-Z]*$"))) {
                System.out.println("\nEnter letters only. Please re-enter: "); 
                details = input.nextLine(); }
            customer1.setfirstName(details);
            
            System.out.print("Last name: ");
            details = input.nextLine();   
            while (!(details.matches("^[a-zA-Z]*$")))  {
                System.out.println("\nEnter letters only. Please re-enter: ");
                details = input.nextLine(); }       
            customer1.setlastName(details);
            
            System.out.print("Address (Street-nr): ");
            details = input.nextLine();
            while(!(details.matches("[a-zA-Z-0-999]*$"))){
                System.out.println("\nEnter letters only. Please re-enter: ");
                details = input.nextLine(); }   
            customer1.setaddress(details);
            
            System.out.print("Postcode (Cph. Area): ");
            details = input.nextLine();
            while(!(details.matches("^(1[2-9]00)|(2[0-5]00)"))) {
                System.out.println("\nEnter Copenhagen postcode only (1200-2500).");
                System.out.print("Postcode: "); 
                details = input.nextLine();}       
            customer1.setpostcode(details);
            
            System.out.print("Date of birth (DD/MM/YYYY): ");
            details = input.nextLine();
                while (!(details.matches("^[0-3]?[0-9].[0-3]?[0-9].(?:[1-2]?[9,2])(?:[0-9]{2})$"))) {
                System.out.println("\nUse the format DD/MM/YYYY and a valid year only.");
                System.out.print("Date of birth: ");
                details = input.nextLine(); }
            customer1.setdob(details);
                
            System.out.print("Telephone nr: ");
            details = input.nextLine();
            while (!(details.matches("\\d\\d\\d\\d\\d\\d\\d\\d"))) {
                System.out.println("\nPlease enter 8 digit number.");
                System.out.println("Phone nr: ");
                details = input.nextLine(); }
            customer1.setphone(details);
            
            System.out.print("CPR nr (xxxxxx-xxxx): ");
            details = input.nextLine();
            while(!(details.matches("\\d\\d\\d\\d\\d\\d-\\d\\d\\d\\d"))) {
                System.out.println("\nPlease enter digits in the format xxxxxx-xxxx only.");
                System.out.println("CPR nr: ");
                details = input.nextLine(); }
            customer1.setcpr(details);
            
            System.out.println("You are now registered! ");
            
            System.out.println("\n≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈\n"); 
            System.out.println("   Login information: ");
            System.out.println("   Username: " + customer1.getuserName());
            customer1.setuserName(details);
            System.out.println("   Password: " + customer1.getpassword());
            customer1.setpassword(details);
            
            return customer1;

            }
    
		public static void printCustomerDetails(ArrayList<Customer> customer1) {
            for (Customer user: customer1){
                if (user instanceof Customer)
                    System.out.println(user);
            		}
            	} 
    }
	