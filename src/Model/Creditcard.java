package Model;

public class Creditcard {

	private String cardnumber;
	private String expireDate;
	private String cscNumber;
	
	public Creditcard() {
		}
	
	public Creditcard(String cardnumber,String expireDate,String cscNumber) {	
	this.cardnumber = cardnumber;
	this.expireDate = expireDate;
	this.cscNumber = cscNumber;
	}

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getCscNumber() {
		return cscNumber;
	}

	public void setCscNumber(String cscNumber) {
		this.cscNumber = cscNumber;
	}

	@Override 

	public String toString() {
		return "card: "  + getCardnumber() + " Date: " + getExpireDate() +  " sec: " + getCscNumber(); 
	}

}
