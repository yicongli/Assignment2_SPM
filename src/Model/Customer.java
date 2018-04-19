package Model;

import Database.TextFileCustomer;

public class Customer {
        private String firstName,lastName,address, postcode, dob, phone, cpr, userName, password; 
        
        public Customer(){ //Constructor
        }
        
        // constructor with specifics
        protected Customer(String firstName, String lastName, String address, String postcode, String dob, String phone, String cpr, String userName, String password) {
             }
        
         // getters
         public String getfirstName() {
             return firstName;
         }
         public String getlastName() {
             return lastName;
         }
         public String getaddress() {
             return address;
         }
         public String getpostcode() {
             return postcode;
         }
         public String getdob() {
             return dob;
         }
         public String getphone() {
             return phone;
         }
         public String getcpr() {
             return cpr; 
         }
         public String getuserName() {
             return userName =  firstName.substring(0, 1).toUpperCase() + lastName.substring(0, 3).toUpperCase();
             
         }
         public String getpassword() {
             return password = lastName.substring(0, 3).toLowerCase() + cpr.substring(7, 11);
         }
         
         // setters
         public void setfirstName(String firstName) {
             this.firstName = firstName;
         }
         public void setlastName(String lastName) {
             this.lastName = lastName;
         }
         public void setaddress(String address) {
             this.address = address;
         }
         public void setpostcode(String postcode) {
             this.postcode = postcode;
         }
         public void setdob(String dob) {
             this.dob = dob;
         }
         public void setphone(String phone) {
             this.phone = phone;
         }
         public void setcpr(String cpr) {
             this.cpr = cpr;
         }
         public void setuserName(String userName) {
             this.userName = userName;
         }
         public void setpassword(String password) {
             this.password = password; 
             }
       public void setuserName() {
           this.userName = firstName.substring(0, 1).toUpperCase() + lastName.substring(0, 3).toUpperCase();
       }
       public void setpassword() {
           this.password = lastName.substring(0, 3).toLowerCase() + cpr.substring(7, 11);
           }
        
         @Override
         
         //Print Customer
         public String toString(){
             return String.format("%-12s %-12s %-15s %-12s %-12s %-12s %-12s %-12s %-12s", "| " + firstName, "| " + lastName, "| " + address, "| " + postcode, "| " + dob, "| " + phone, "| " + cpr, "| " + getuserName(),"| " + getpassword()); 
            }
         // Write to File
         public void writetoFile(){
             String Details = firstName + ";" + lastName + ";" + address +";" + postcode+ ";" + dob+ ";" + phone+ ";" + cpr + ";" + getuserName() + ";" + getpassword() + ";";
             TextFileCustomer.WriteDetails("customer.txt", Details);     
         }
}

	
	
	