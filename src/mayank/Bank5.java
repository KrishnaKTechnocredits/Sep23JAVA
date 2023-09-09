package mayank;

class Bank5{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;
	void setPrimaryInfo(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void setOtherInfo(String cmpName,String city,int pincode){
		this.cmpName = cmpName;
		this.city = city;
		this.pincode = pincode;
	}
	
	void printAllDetails(){
		System.out.println("First Name is "+ firstName);
		System.out.println("last Name  is "+ lastName);
		System.out.println("cmpName is "+ cmpName);
		System.out.println("city is "+ city);
		System.out.println("pincode "+ pincode);
	}
	public static void main(String[] args){
		Bank5 bank = new Bank5();
		bank.setPrimaryInfo("Mayank","Batham");
		bank.setOtherInfo("ABC","Pune",410507);
		bank.printAllDetails();
	}
}