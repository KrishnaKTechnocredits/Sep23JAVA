package sayali;

class Bank1{
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
		System.out.println("First Name is : " + firstName);
		System.out.println("last Name is : " + lastName);
		System.out.println("Company Name is : " + cmpName);
		System.out.println("City Name is : " + city);
		System.out.println("Pincode is : " + pincode);
	}
	
	public static void main(String[] args){
		Bank1 bank1 = new Bank1();
		bank1.setPrimaryInfo("Sayali", "Honrao");
		bank1.setOtherInfo("TCS", "Pune", 412307);
		bank1.printAllDetails();
	}
}