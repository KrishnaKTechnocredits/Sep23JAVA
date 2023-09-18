/*Assignment - 4 : 4th Sep'2023
1.	I want to create a class called Bank. instance variable : firstName, lastName, cmpName, city, pincode
2.	setPrimaryInfo(String firstName, String lastName), parameterized method -> firstName, lastName
3.	setOtherInfo(String cmpName, String city, int pincode), parameterized method -> cmpName, city, pincode
4.	printAllDetails() -> print all 5 instance variable. main -> setPrimaryInfo() -> setOtherInfo() -> printAllDetails()
*/

package mahesh;

class Assignment4Bank {
	
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;

	void setPrimaryInfo(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	void setOtherInfo(String cmpName, String city, int pincode) {
		this.cmpName = cmpName;
		this.city = city;
		this.pincode = pincode;
	}

	void printAllDetails() {
		System.out.println("first name of the customer is " + firstName);
		System.out.println("Last name of the customer is " + lastName);
		System.out.println("Company name of the customer is " + cmpName);
		System.out.println("City name of the customer is " + city);
		System.out.println("Pincode of the customer is " + pincode);
	}

	public static void main(String[] args) {
		Assignment4Bank bank = new Assignment4Bank();
		bank.setPrimaryInfo("Mahesh", "Borkar");
		bank.setOtherInfo("Globant", "Pune", 411052);
		bank.printAllDetails();
	}
}