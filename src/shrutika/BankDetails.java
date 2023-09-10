package shrutika;
class BankDetails{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void setOtherInfo(String cmpName, String city, int pincode){
		this.cmpName = cmpName;
		this.city = city;
		this.pincode = pincode;
	}
	
	void printAllDetails(){
		System.out.println("Name: "+firstName);
		System.out.println("Lastname: "+lastName);
		System.out.println("Comapny name: "+cmpName);
		System.out.println("City name: "+city);
		System.out.println("Pincode: "+pincode);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		bankDetails.setPrimaryInfo("Shrutika","Benakatti");
		bankDetails.setOtherInfo("TCS","Pune",411014);
		bankDetails.printAllDetails();
	}
}