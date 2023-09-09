/* Assignment#4
I want to create a class called Bank.
instance variable : firstName, lastName, cmpName, city, pincode

1. setPrimaryInfo(String firstName, String lastName), parameterized method -> firstName, lastName
2. setOtherInfo(String cmpName, String city, int pincode), parameterized method -> cmpName, city, pincode
3. printAllDetails() -> print all 5 instance variable.

main -> setPrimaryInfo() -> setOtherInfo() -> printAllDetails()
*/
package jyoti;
class BankDetails{
	
	String firstName;
	String lastName;
	String compName;
	String city;
	int pin;
	
		void setPrimaryInfo(String firstName, String lastName){
			this.firstName=firstName;
			this.lastName=lastName;
					
		}
		void setOtherInfo(String compName, String city , int pin){
			this.compName=compName;
			this.city=city;
			this.pin=pin;
		}
		void printAllDetails(){	
			System.out.println("Customer's first name is : " +firstName);
			System.out.println("Customer's last name is : " +lastName);
			System.out.println("Company name is : "+compName);
			System.out.println("City is : " +city);
			System.out.println("Pincode  : "+pin);
		}
		public static void main(String [] args){
			BankDetails bnkdtl= new BankDetails();
			bnkdtl.setPrimaryInfo("Jyoti","Saxena");
			bnkdtl.setOtherInfo("Zen","Pune",412208);
			bnkdtl.printAllDetails();
		}
}