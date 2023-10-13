package subramanium;
class BankSbi{
	
	String firstName;
	String lastName;
	String companyName;
	String city;
	int pincode;
	
	void primaryInfo(String firstName, String lastName){
	this.firstName=firstName;
	this.lastName=lastName;
	}
	
	void otherInfo(String companyName, String city,int pincode){
	this.companyName=companyName;
	this.city=city;
	this.pincode=pincode;
	}
	
	void printDetails(){
	System.out.println("First Name is "+firstName);
	System.out.println("Last Name is "+lastName);
	System.out.println("Company Name is "+companyName);
	System.out.println("City is "+city);
	System.out.println("Pincode is "+pincode);
	}
	
	public static void main(String [] args){
	BankSbi bankSbiInfo	= new BankSbi();
	bankSbiInfo.primaryInfo("Subramanian", "Pillai");
	bankSbiInfo.otherInfo("Accenture","Mumbai", 410218);
	bankSbiInfo.printDetails();
	}
}	