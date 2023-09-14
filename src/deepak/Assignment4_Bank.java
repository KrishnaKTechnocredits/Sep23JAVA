/*Assignment - 4 : 4th Sep'2023

I want to create a class called Bank.
instance variable : firstName, lastName, cmpName, city, pincode

1. setPrimaryInfo(String firstName, String lastName), parameterized method -> firstName, lastName
2. setOtherInfo(String cmpName, String city, int pincode), parameterized method -> cmpName, city, pincode
3. printAllDetails() -> print all 5 instance variable.

main -> setPrimaryInfo() -> setOtherInfo() -> printAllDetails()
*/
package deepak;
class Assignment4_Bank{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pinCode;
	
	void setPrimaryInfo(String fName, String lName){
		firstName = fName;
		lastName = lName;
	}
	
	void setOtherInfo(String cmpName, String city, int pinCode){
		this.cmpName = cmpName;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	void printAllDetails(){
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Company Name: "+cmpName);
		System.out.println("City: "+city);
		System.out.println("Pin Code: "+pinCode);
	}
	
	public static void main(String[] args){
		Assignment4_Bank bank = new Assignment4_Bank();
		bank.setPrimaryInfo("Deepak","Kankhar");
		bank.setOtherInfo("Deloitte", "Pune", 411033);
		bank.printAllDetails();
	}
}