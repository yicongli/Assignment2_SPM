package Model;

import java.util.ArrayList;
import Database.TextFileCustomer;

public class CustomerDatabase {
    
        private ArrayList<Customer> Userdatabase;

        public CustomerDatabase(){
            Userdatabase = TextFileCustomer.getAllCustomerDetails();
            }
    
        public ArrayList<Customer> getDatabase() {
            return Userdatabase;
                }      
}

