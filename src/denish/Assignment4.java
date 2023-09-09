package denish;

class Bank{
	
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void setOtherInfo(String cmpName, String city, int pincode){
		this.cmpName = cmpName;
		this.city = city;
		this.pincode = pincode;
	}
	
	void printAllDetails(){
		System.out.println("First name = "+firstName);
		System.out.println("Last name = "+lastName);
		System.out.println("Cmp name = "+cmpName);
		System.out.println("City name = "+city);
		System.out.println("Pincode = "+pincode);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.setPrimaryInfo("Denish","Santoki");
		bank.setOtherInfo("Apple","Pune",363612);
		bank.printAllDetails();
	}
}