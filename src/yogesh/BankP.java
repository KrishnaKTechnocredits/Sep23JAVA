//ASSSIGN 4 BANK details with parameters.
package yogesh;
class BankP{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	void setOtherInfo(String cmpName,String city,int pincode){
		this.cmpName=cmpName;
		this.city=city;
		this.pincode=pincode;
	}
	
	void printAllDetails(){
		System.out.println("First Name is  "+firstName);
		System.out.println("Last Name is  "+lastName);
		System.out.println("Company Name is  "+cmpName);
		System.out.println("City Name is  "+city);
		System.out.println("Pincode is  "+pincode);
	}
	public static void main(String[] args){
		BankP bank=new BankP();
		bank.setPrimaryInfo("Yogesh","Chhatwani");
		bank.setOtherInfo("Techno","Pune",413003);
		bank.printAllDetails();
	}
	
}