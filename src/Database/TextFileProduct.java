package Database;

import java.io.*;
import java.util.*;
import Model.Bike;
import Model.ElectricBike;
import Model.Product;

public class TextFileProduct {
	
	private Scanner z; 
	public void createProductFile(){
			String fileName = "Product.txt";
			try{
				z = new Scanner(new File("Product.txt"));
				}
		catch (FileNotFoundException ex) {
			try {
				Writer output;
				output = new BufferedWriter(new FileWriter(fileName, true));
				output.close();
				} 
		catch (IOException ex2) {
				System.out.println("Error writing to file '" + fileName + "'");
				}
				}
		}
	
			// Read to file
		public static Scanner readProductDetails(String file) {
			Scanner input = new Scanner(System.in);
		try{
			File ReadFile = new java.io.File(file);
			input = new Scanner(ReadFile);
			}
		catch (FileNotFoundException ex) {
				System.out.println("Error writing to file '" + file + "'");	
			}
		return input; 
		}			
		
	
		//Write details to product file
	public static void WriteProductDetails2(String file, String abc){
		try{
			FileWriter fwriter = new FileWriter(file,true);
			PrintWriter output = new java.io.PrintWriter(fwriter);
			output.println(abc);
			output.close();
			}
		catch (IOException ex) {
			// if the file is not accessible, print this message
			System.out.println("Error writing to file '" + file + "'");
			}
		}
		//Makes arrayList on file of Product
	public static ArrayList<Product> getAllProductDetails(){
	    ArrayList<Product> productList = new ArrayList<Product>();
	    Scanner input = readProductDetails("Product.txt"); 
	    while (input.hasNextLine()) {
	        productList.add(getProduct(input.nextLine()));
	            }    
	    return productList;   
		}
	
	//Changes Input to String
	public static Product getProduct(String line){
		String[] values = line.split(";"); 
		if (values[1].equalsIgnoreCase("Bike")){ 
			Bike bikeFromFile = new Bike();
			bikeFromFile.setId(Integer.parseInt(values[0]));
			bikeFromFile.setType(values[1]);
			bikeFromFile.setName(values[2]);
			bikeFromFile.setPrice(values[3]);
			bikeFromFile.setLocation(values[4]);
			bikeFromFile.setGear(values[5]);
		
			return bikeFromFile;
		}
		else {
			ElectricBike electricalBikeFromFile = new ElectricBike();
			electricalBikeFromFile.setId(Integer.parseInt(values[0]));
			electricalBikeFromFile.setType(values[1]);
			electricalBikeFromFile.setName(values[2]);
			electricalBikeFromFile.setPrice(values[3]);
			electricalBikeFromFile.setLocation(values[4]);
			electricalBikeFromFile.setBatteryTime(values[5]);
		
			return 	electricalBikeFromFile;	
		}	
	}
	
}
			
