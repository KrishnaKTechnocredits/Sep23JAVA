package narendra;

class Bank {
	String firstName;
	String lastName;
	String companyName;
	String city;
	int pincode;

	void setPrimaryInfo(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	void setOtherInfo(String companyName, String city, int pincode) {
		this.companyName = companyName;
		this.city = city;
		this.pincode = pincode;
	}

	void printAllDetails() {
		System.out.println("First Name -> " + firstName);
		System.out.println("Last Name -> " + lastName);
		System.out.println("Company Name -> " + companyName);
		System.out.println("City Name -> " + city);
		System.out.println("Pincode -> " + pincode);
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setPrimaryInfo("Narendra", "Deshmukh");
		bank.setOtherInfo("Amdocs", "Pune", 411028);
		bank.printAllDetails();
	}
}
