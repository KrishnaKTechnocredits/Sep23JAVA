package pavan;

//assi 4
class Bank{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pinCode;
	
	void setPrimaryInfo(String firstName , String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("First Name id = "+firstName);
		System.out.println("Last Name = "+lastName);
	}
	
	void setOtherInfo(String cmpName , String city , int pincode){
		this.cmpName = cmpName;
		this.city = city;
		this.pinCode = pincode;
		System.out.println("Company Name is = "+cmpName);
		System.out.println("City Name is = "+city);
		System.out.println("pinCode = "+pinCode);
	}
	
	public static void main (String[] args){
		Bank bank = new Bank();
		bank.setPrimaryInfo("pavan" , "chaudhari");
		bank.setOtherInfo("one" , "pune" , 413003);
	}
}
	
	
	