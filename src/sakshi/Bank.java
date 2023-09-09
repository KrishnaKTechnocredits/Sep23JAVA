package sakshi;

class Bank{
	
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	void setOtherInfo(String cmpName, String city, int pincode){
		this.cmpName=cmpName;
		this.city=city;
		this.pincode=pincode;
	}
	
	void printAllDetails(){
		System.out.println("First name of the customer is " +firstName);
		System.out.println("Last name of the customer is " +lastName);
		System.out.println("Company name of the customer is " +cmpName);
		System.out.println("City name of the customer is " +city);
		System.out.println("Pincode of the customer is " +pincode);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.setPrimaryInfo("Sakshi","sen");
		bank.setOtherInfo("Technocredits","Indore",452011);
		bank.printAllDetails();
	}
}