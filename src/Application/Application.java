package Application;

import Controller.ControllerMenus;
import Database.TextFileCustomer;
import Database.TextFileProduct;

public class Application {
								
	public static void main(String[] args) throws Exception {

		//Creates text files
		TextFileCustomer customerFile = new TextFileCustomer();
		TextFileProduct productFile = new TextFileProduct();
		productFile.createProductFile(); 
		customerFile.createCustomerFile();
		
		//run program
		ControllerMenus runStartMenu = new ControllerMenus();
		runStartMenu.startMenu();
	}		
}





