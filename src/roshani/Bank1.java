/*I want to create a class called Bank.
instance variable : firstName, lastName, cmpName, city, pincode

1. setPrimaryInfo(String firstName, String lastName), parameterized method -> firstName, lastName
2. setOtherInfo(String cmpName, String city, int pincode), parameterized method -> cmpName, city, pincode
3. printAllDetails() -> print all 5 instance variable.

main -> setPrimaryInfo() -> setOtherInfo() -> printAllDetails()
*/
package roshani;

class Bank1{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pinCode;
	
	void setPrimaryInfo(String firstName, String lastName){
		this.firstName = firstName; 
		this.lastName = lastName;
	} 
	
	void setOtherInfo(String cmpName, String city){
		this.cmpName = cmpName;
		this.city = city;
		pinCode = 424567;
	} 
	
	void printAllDetails(){
		System.out.println("Please find below details of Bank Employee: ");
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName); 
		System.out.println("Company Name: " + cmpName); 
		System.out.println("City name: " + city); 
		System.out.println("Pin code is: " + pinCode); 	
	}
	
	public static void main(String[] args){
		Bank1 bank = new Bank1();
		bank.setPrimaryInfo("Roshni","Kolhe");
		bank.setOtherInfo("Technocredit","Pune");
		bank.printAllDetails();
	}
}