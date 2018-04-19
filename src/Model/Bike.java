package Model;

import Database.TextFileProduct;

public class Bike extends Product{

	private String gear;
	
	public Bike() {
		}
	
	public Bike(String type, String name, String price, String location, String gear) {
		super(type, name, price, location);
		this.gear = gear; 
		}
	
	public String getGear() {
		return gear;
		}
		
	public void setGear(String gear) {
		this.gear = gear;
		}
		
	@Override 
	
	//Print Bike Details
	public String toString() {
	    return String.format("%-11s %-18s %-18s %-18s %-18s %-18s","| " + getId(), "| "+ getType(), "| "+   getName(), "| " + getPrice(),  "| " + getLocation(), "| " + getGear());
		}
	//Write to File
	public void writetoBikeFile(){
	    String Details = getId() + ";" + type + ";" + name + ";" + price + ";" + location + ";" + gear + ";";
	    TextFileProduct.WriteProductDetails2("Product.txt", Details);
		}
	}
	
