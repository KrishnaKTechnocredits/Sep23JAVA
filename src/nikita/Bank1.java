package nikita;

class Bank1{
	
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
		System.out.println("The firstname is: "+firstName);
		System.out.println("The lastName is: "+lastName);
		System.out.println("The companyname is: "+cmpName);
		System.out.println("The city is:" +city);
		System.out.println("The pincode is: "+pincode);
	}
	
	public static void main(String[] args){
		Bank1 bank= new Bank1();
		bank.setPrimaryInfo("Nikita","Naik");
		bank.setOtherInfo("HCL","Pune",411019);
		bank.printAllDetails();
	}
}