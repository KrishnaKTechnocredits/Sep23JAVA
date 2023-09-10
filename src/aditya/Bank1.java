package aditya;
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
	
	void setOtherInfo(String cmpName,String city, int pincode){
		this.cmpName=cmpName;
		this.city=city;
		this.pincode=pincode;
	}
	
	void prinAllDetails(){
		System.out.println("FIRSTNAME :- " +firstName);
		System.out.println("LASTNAME :- " +lastName);
		System.out.println("COMPANY NAME :- " +cmpName);
		System.out.println("CITY :- " +city);
		System.out.println("PINCODE :- " +pincode);
	}
	
	public static void main(String[] args){
		Bank1 bank1 = new Bank1();
		bank1.setPrimaryInfo("Aditya","Kunjir");
		bank1.setOtherInfo("MAGIC","PUNE",411041);
		bank1.prinAllDetails();
	}
}