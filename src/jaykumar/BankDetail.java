package jaykumar;

class BankDetail{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;
	
	void setPrmaryInfo(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	void setOtherInfo(String cmpName, String city, int pincode){
		this.cmpName = cmpName;
		this.city = city;
		this.pincode = pincode;
	}
	
	void printAllDetails(){
		System.out.println("First name is : " + firstName);
		System.out.println("Last name is ; " + lastName);
		System.out.println("Company name is ; " + cmpName);
		System.out.println("City name is ; " + city);
		System.out.println("Pincode is ; " + pincode);
	}
	
	public static void main(String[] args){
		BankDetail bankdetail = new BankDetail();
		bankdetail.setPrmaryInfo("Jaykumar", "Bankar");
		bankdetail.setOtherInfo("DS", "Pune", 411057);
		bankdetail.printAllDetails();
	}
}
		