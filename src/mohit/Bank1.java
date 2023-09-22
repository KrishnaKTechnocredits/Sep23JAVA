/*Assignment - 4 : 4th Sep'2023

I want to create a class called Bank.
instance variable : firstName, lastName, cmpName, city, pincode

1. setPrimaryInfo(String firstName, String lastName), parameterized method -> firstName, lastName
2. setOtherInfo(String cmpName, String city, int pincode), parameterized method -> cmpName, city, pincode
3. printAllDetails() -> print all 5 instance variable.

main -> setPrimaryInfo() -> setOtherInfo() -> printAllDetails()
*/

package mohit;


class Bank1{
	
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;	
	}
	
	void setOtherInfo(String cmpName, String city, int pincode){
		this.cmpName=cmpName;
		this.city=city;
		this.pincode=pincode;
	}	
	
	void printAllDetails(){
		System.out.println("The value of firstName is : " + firstName);
		System.out.println("The value of firstName is : " + lastName);
		System.out.println("The value of firstName is : " + cmpName);
		System.out.println("The value of firstName is : " + city);
		System.out.println("The value of firstName is : " + pincode);	
	}	
	
	public static void main(String[] args){
		Bank1 bank1 = new Bank1();
		bank1.setPrimaryInfo("Ramesh", "Tiwari");
		bank1.setOtherInfo("Wipro", "Indore", 474009);
		bank1.printAllDetails();
	}
}	
		
			