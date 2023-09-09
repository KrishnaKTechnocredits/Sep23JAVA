package rahul;

class Assignment4_Bank {
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
	void setOtherInfo(String companyName, String cityName, int pin) {
		cmpName = companyName;
		city = cityName;
		pincode = pin;
	}
	
	void printAllDetails() {
		System.out.println("Emp details are, First name: " + firstName + ", Last name: " + lastName + ", Company name: " + cmpName + ", City: " + city + ", Pincode: " + pincode);
	}
	
	public static void main(String args[]) {
		Assignment4_Bank assignment4_bank = new Assignment4_Bank();
		assignment4_bank.setPrimaryInfo("Rahul", "Hiremath");
		assignment4_bank.setOtherInfo("Persistent", "PCMC" , 411033);
		assignment4_bank.printAllDetails();
	}
}