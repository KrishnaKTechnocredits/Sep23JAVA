package swati;

//ASSIGNMENT 4
class Bank2{
	
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pinCode;
	
	void setPrimaryInfo(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	void setOtherInfo(String cmpName,String city,int pinCode){
		this.cmpName=cmpName;
		this.city=city;
		this.pinCode=pinCode;
	}
	
	void printAllDetails(){
		System.out.println("First name is = "+firstName);
		System.out.println("Last name is = "+lastName);
		System.out.println("Company name is = "+cmpName);
		System.out.println("City name is = "+city);
		System.out.println("PinCode is = "+pinCode);
	}
	
	public static void main(String[] args){
		Bank2 bank2 = new Bank2();
		bank2.setPrimaryInfo("Swati","Kudale");
		bank2.setOtherInfo("Zen","Pune",411014);
		bank2.printAllDetails();
	}		
	
}