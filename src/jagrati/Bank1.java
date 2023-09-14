package jagrati;



//I want to create a class called Bank.
//instance variable : firstName, lastName, cmpName, city, pincode
//1. setPrimaryInfo(String firstName, String lastName), parameterized method -> firstName, lastName
//2. setOtherInfo(String cmpName, String city, int pincode), parameterized method -> cmpName, city, pincode
//3. printAllDetails() -> print all 5 instance variable.

//main -> setPrimaryInfo() -> setOtherInfo() -> printAllDetails()

class Bank1{
	String firstName;
	String lastName;
	String cmpName;
	String city; 
	int pincode;
	
	void setPrimaryInfo(String firstName, String lastName){
		this.firstName =firstName;
		this.lastName =lastName;			
	}
	
	void setOtherInfo(String cmpName, String city, int pincode){
		this.cmpName = cmpName;
		this.city = city;
		this.pincode = pincode;
	}
	
	void printAllDetails(){
		System.out.println("Bank emp first name " + firstName);
		System.out.println("Bank emp last name " + lastName);
		System.out.println("Bank emp company name " + cmpName);
		System.out.println("Bank emp city name " + city);
		System.out.println("Bank emp pincode name " + pincode);
	}
	public static void main(String [] args){
		Bank1 bank = new Bank1();
		bank.setPrimaryInfo("Jagrati","Bairagi");
		bank.setOtherInfo("Pinelabs","Noida",452001);
		bank.printAllDetails();	
	}
}