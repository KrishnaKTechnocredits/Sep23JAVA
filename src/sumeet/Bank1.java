package sumeet;

class Bank1{
	String firstName, lastName, company, city;
	int pinCode;
	
	void setPrimaryInfo(String firstName, String lastName, String company){
		this.firstName=firstName;
		this.lastName=lastName;
		this.company=company;		
	}
	
	void setOtherInfo(String city, int pinCode){
		this.city=city;
		this.pinCode=pinCode;
	}
	
	void printAllDetails(){
		System.out.println("First Name :" + firstName);
		System.out.println("Last Name  :" + lastName);
		System.out.println("Company    :" + company);
		System.out.println("City       :" + city);
		System.out.println("PinCode    :" + pinCode);
	}
	
	public static void main(String[] args){
		Bank1 bank= new Bank1();
		bank.setPrimaryInfo("Sumit", "Kanase", "TechoCredits");
		bank.setOtherInfo("Pune", 123456);
		bank.printAllDetails();		
	}
}
