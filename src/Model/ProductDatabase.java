package Model;

import java.util.ArrayList;
import Database.TextFileProduct;

public class ProductDatabase { 
	
		private ArrayList<Product> database;

		public ProductDatabase(){ 
			database = TextFileProduct.getAllProductDetails();
			}
	
		public ArrayList<Product> getDatabase() { 
			return database;
				}
	}
	  