 package Database; 

import java.util.ArrayList;
import java.util.*;
import java.io.*;
import Model.Customer;

	public class TextFileCustomer {
			
		//Creating file for customer - if non in system
	private Scanner x; 
	public void createCustomerFile(){ 
		String fileName = "Customer.txt";
			try{
				x = new Scanner(new File("Customer.txt"));
				}
				// Create file of not found
			catch (FileNotFoundException ex) {
			try {
				Writer output;
				output = new BufferedWriter(new FileWriter(fileName, true));
				output.close();
			} catch (IOException ex2) {
				System.out.println("Error writing to file '" + fileName + "'");
			}
		}
	}		

			//	Read from files 
	public static Scanner readDetails(String file) {
			Scanner input = new Scanner(System.in);
			try{
				File ReadFile = new java.io.File(file);
				input = new Scanner(ReadFile);
				}
			catch (FileNotFoundException ex) {
				System.out.println("Error reading "
					+ " file : " + file);
				}
			return input; 
			}

		//Write data to file
	public static void WriteDetails(String file, String input){
			try{
				FileWriter fwriter = new FileWriter(file,true);
				PrintWriter output = new java.io.PrintWriter(fwriter);
				output.println(input);
				output.close();
				}
			catch (IOException ex) {
				// if the file is not accessible, print this message
				System.out.println("Error writing to file '" + file + "'");
				} 
			}
					
		//Changes Input to String
	public static Customer getCustomer(String line){
		    		Customer Customer1 = new Customer();
		    	// Look for every ";" and turns the values into strings
		    		String[] values = line.split(";");
		        // Change the String type into the correct format
		    		Customer1.setfirstName(values[0]);
		    		Customer1.setlastName(values[1]);
                    Customer1.setaddress(values[2]);
                    Customer1.setpostcode(values[3]);
                    Customer1.setdob(values[4]);
                    Customer1.setphone(values[5]);
                    Customer1.setcpr(values[6]);
                    Customer1.setuserName(values[7]);
                    Customer1.setpassword(values[8]);
		    return Customer1;
		}

		//Makes arrayList on file of Customer
	public static ArrayList<Customer> getAllCustomerDetails(){
		   ArrayList <Customer> customerList = new ArrayList<Customer>();
		   Scanner input = readDetails("Customer.txt"); 
		    // checking each line 
		  while (input.hasNextLine()) {
		        customerList.add(getCustomer(input.nextLine()));
		        //passing each line to the method getCustomer which returns a customer
		        } 
		    
		  return customerList;
		}		
	}