package View;

import java.util.Scanner;
import Model.Creditcard;
import Controller.ControllerCreditcard;

public class viewCreditcard {
	
	public viewCreditcard(){
	}
	
    public static Creditcard myCredictcard() {
    	
    System.out.println("\n≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈ Payment ≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈\n ");
	Scanner input1 = new Scanner(System.in);
	String creditDetails;
	Creditcard Card = new Creditcard();
	boolean valid = false; 
	
			while (!valid){
					System.out.println("\nEnter Creditcard number: ");
						creditDetails = input1.nextLine();
						if(creditDetails.length()==16 && (creditDetails.startsWith("5") || (creditDetails.startsWith("2")))) { 
						//[1-5][2-7]		
						System.out.println("-----------Mastercard-----------\n");
						if(ControllerCreditcard.luhnCheck(creditDetails) == true){
							System.out.println("CreditCardnumber accepted!\n");
							valid = true;
							}else {
							System.out.println("CreditCardnumber not accepted, Try again! \n");
							valid = false;
							}
						}
						else if ((creditDetails.length()==19 || creditDetails.length()==16 ||creditDetails.length()==13) && creditDetails.startsWith("4")) {
							if(ControllerCreditcard.luhnCheck(creditDetails)== true){
							System.out.println("-----------Visacard-----------\n");
							System.out.println("CreditCardnumber accepted!\n");
							valid = true;
							}else {
							System.out.println("'" + creditDetails + "'" + " is not a valid card, try again (Visa/Mastercard/Dancard), Try again! ");
							valid = false;
							}
						}
						else{
							System.out.println("'" + creditDetails + "'" + " is not a valid card (Visa/Mastercard/Dancard), Try again! ");
							valid = false;
							}
			 			}
			
			valid = false; 
			while (!valid) {
						System.out.println("Enter the Expire Date (mm/yy): ");
						creditDetails = input1.nextLine();
						if (creditDetails.matches("^[0-1]?[0-2].[1-3]?[1-9]$") || creditDetails.matches("^[0]?[1-9].[1-3]?[1-9]$")){
							Card.setExpireDate(creditDetails);
							valid = true; 
							}
						else {
							System.out.println("'" + creditDetails + "'" + " is not a valid Expire date, Try again! ");
							valid = false;
							}
						}

			valid = false;		
			while(!valid) {
						System.out.println("Enter the CSC Number (Card Security Code - 3 digits) ");
						creditDetails = input1.nextLine();
						if (creditDetails.length()==3 && creditDetails.matches("\\d\\d\\d")) {
							Card.setCscNumber(creditDetails);
							valid = true; 
							}
						else {
							System.out.println("'" + creditDetails + "'" + " is not a valid CSC number, try again (3 digits): "); 
							creditDetails = input1.nextLine();
							}
						}
			return Card;
			} 
	}
			