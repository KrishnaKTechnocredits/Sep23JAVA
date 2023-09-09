package vishal;

class Bank4{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pinCode;
	
	void setPrimaryInfo(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	void setOtherInfo(String cmpName,String city, int pinCode){
		this.cmpName=cmpName;
		this.city=city;
		this.pinCode=pinCode;
	}
	
	void printAllDetails(){
		System.out.println("First name is := " + firstName);
		System.out.println("Last name is := " + lastName);
		System.out.println("Company name is := " + cmpName);
		System.out.println("City name is := " + city);
		System.out.println("PinCode is := " + pinCode);
	}
	
	public static void main(String[] arg){
		Bank4 bank4 = new Bank4();
		bank4.setPrimaryInfo("Vishal","More");
		bank4.setOtherInfo("Inf","Pune",411028);
		bank4.printAllDetails();
	}
}
	
		
	
