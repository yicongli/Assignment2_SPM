package Model;

public class Product {
	private static int count = 0;
	protected String name;
	private int id;
	protected String price; 
	protected String location;
	protected String type;
	
	public Product(){
		this.id = count++;
	}

public Product (String type, String name, String price, String location) {
	this.type = type;
	this.name = name;
	this.price = price; 
	this.location = location;
	this.id = count++;
	}

public static int getCount() {
	return count;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
	
}

public String getLocation() {
	return location;
}


public void setLocation(String location) {
	this.location = location;
}


}
