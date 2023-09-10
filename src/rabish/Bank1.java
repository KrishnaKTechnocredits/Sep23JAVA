package rabish;
class Bank1 {

	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	void setOtherInfo(String cmpName, String city, int pincode){
		this.cmpName=cmpName;
		this.city=city;
		this.pincode=pincode;
	}
	void printAllDetails(){
		System.out.println("First Name=:"+firstName);
		System.out.println("First Name=:"+lastName);
		System.out.println("Company Name=:"+cmpName);
		System.out.println("City =:"+city);
		System.out.println("Pincode=:"+pincode);
	}
	
	public static void main(String[] args){
	Bank1 bank = new Bank1();
	bank.setPrimaryInfo("Ravish","Raj");
	bank.setOtherInfo("Atos","Pune",411015);
	bank.printAllDetails();
	}
}