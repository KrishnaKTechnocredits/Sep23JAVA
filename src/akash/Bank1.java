package akash;

class Bank1{
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
		System.out.println("Fisrt name is : " +firstName);
		System.out.println("Last name is : " +lastName);
		System.out.println("Cmp name is : " +cmpName);
		System.out.println("City name is : " +city);
		System.out.println("Pincodeis : " +pincode);
	}
	
	public static void main(String[] args){
		Bank1 bank1 = new Bank1();
		bank1.setPrimaryInfo("Akash","Pawar");
		bank1.setOtherInfo("Accenture","Solapur",413001);
		bank1.printAllDetails();
	}
}