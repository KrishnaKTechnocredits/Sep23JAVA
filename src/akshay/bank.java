package akshay;


class bank{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pinCode;
	
	void setPrimaryInfo(String fName, String lName){
		firstName = fName;
		lastName = lName;
	}
	
	void setOtherInfo(String cmpName, String city, int pinCode){
		this.cmpName = cmpName;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	void printAllDetails(){
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Company Name: "+cmpName);
		System.out.println("City: "+city);
		System.out.println("Pin Code: "+pinCode);
	}
	
	public static void main(String[] args){
		bank bank = new bank();
		bank.setPrimaryInfo("Akshay","Patil");
		bank.setOtherInfo("PTC", "Pune", 415205);
		bank.printAllDetails();
	}
}
