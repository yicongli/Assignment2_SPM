package Model;

import Database.TextFileProduct;

public class ElectricBike extends Product{
	
	 private String batteryTime;
	 
	 public ElectricBike () {
	 }
	 
	public ElectricBike(String type, String name, String price, String location, String batteryTime) {
		super(type, name, price, location);
		this.batteryTime = batteryTime;
		}

	public String getBatteryTime() {
		return batteryTime;
		}

	public void setBatteryTime(String batteryTime) {
		this.batteryTime = batteryTime;
		}

	@Override
	
	//Print El-Bike Details
	public String toString() {
        return String.format("%-11s %-18s %-18s %-18s %-18s %-18s", "| " + getId(), "| " + getType(), "| " + getName(), "| " + getPrice(), "| " + getLocation(), "| " + getBatteryTime());
    	}
	
	//Write to File
	public void writetoElBikeFile() {
		// TODO Auto-generated method stub
		String Details = getId() + ";" + type + ";" + name + ";" + price + ";" + location + ";" + batteryTime + ";";
	    TextFileProduct.WriteProductDetails2("Product.txt", Details);
		}	
}



