/*Assignment - 4 : 4th Sep'2023

I want to create a class called Bank.
instance variable : firstName, lastName, cmpName, city, pincode

1. setPrimaryInfo(String firstName, String lastName), parameterized method -> firstName, lastName
2. setOtherInfo(String cmpName, String city, int pincode), parameterized method -> cmpName, city, pincode
3. printAllDetails() -> print all 5 instance variable.

main -> setPrimaryInfo() -> setOtherInfo() -> printAllDetails() */

package nivedita;
class A4SetInfo{
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
		System.out.println("First name is "+firstName);
		System.out.println("Last name is "+lastName);
		System.out.println("Company name is "+cmpName);
		System.out.println("City is "+city);
		System.out.println("Pincode is "+pincode);
	}
	
	public static void main(String[]args){
		A4SetInfo setInfo = new A4SetInfo ();
		setInfo.setPrimaryInfo("Nivedita","Karnawat");
		setInfo.setOtherInfo("ABC","Pune",411057);
		setInfo.printAllDetails();
	}
}