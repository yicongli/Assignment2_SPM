package View;

import java.util.ArrayList; 
import java.util.Scanner;
import Model.Customer;
import Database.TextFileCustomer;

public class viewLogin {
	
	private ArrayList<Customer>customerDetails;
    
    public viewLogin(){
       customerDetails = TextFileCustomer.getAllCustomerDetails();
    	}

    public boolean login(){
                
        String password = "";
        String userName = "";
        Scanner input = new Scanner(System.in);
        
        int numbersOfTries = 3;  //The number of tries to log-in.
        int counterTries = 0;  //The counter for the loop
        boolean loggedIn = false;  //Sentinel value - breaks the loop
        
        //Do-while countertries is less than allowed tries 3 and not logged in 
        do{
            counterTries++;
            System.out.println("Type in your username: "); 
            userName = input.nextLine();
            System.out.println("Type in your password: "); 
            password = input.nextLine();
            
            	//Here we go through the array with the username. 
             for(int i = 0; i < customerDetails.size() && !loggedIn; i++){
                if(userName.equalsIgnoreCase(customerDetails.get(i).getuserName()) && 
                   password.equalsIgnoreCase(customerDetails.get(i).getpassword())){
                   System.out.println("\nYou are logged in!\n");
                   loggedIn = true;
                   }   
                }
            
            if(!loggedIn && counterTries == 3 ){
            	System.out.println("You exceeded the number of tries - contact admin!");}
            
            else if (!loggedIn)  { 
                System.out.println("\nIncorrect entry, please try again!\n");
            	}
            //We stay in the loop as long the counter for tries is less than the allowed number of tries
        	}while(counterTries < numbersOfTries && !loggedIn);
        
        return loggedIn;    
    	} 
}
        

