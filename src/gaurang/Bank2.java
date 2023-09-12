package gaurang;

class Bank2{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String fN, String lN){
		firstName = fN;
		lastName = lN;
	}
	
	void setOtherInfo(String cN, String ct, int pc){
		cmpName = cN;
		city = ct;
		pincode = pc;
	}
	
	void printAllDetails(){
		System.out.println("Customer's full name is "+ firstName+" "+ lastName);
		System.out.println("He/She is Working in Company called " + cmpName);
		System.out.println("He/She is from " + city);
		System.out.println("Also pincode is "+ pincode);
	}
	
	public static void main(String[] args){
		Bank2 bank2 = new Bank2();
		bank2.setPrimaryInfo("Gaurang","Virani");
		bank2.setOtherInfo("Techno","Ahmendabad",123456);
		bank2.printAllDetails();
	}
}