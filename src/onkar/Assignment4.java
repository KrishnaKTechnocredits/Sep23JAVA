package onkar;

class Assignment4{
	
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
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(cmpName);
		System.out.println(city);
		System.out.println(pincode);
	}
	
	public static void main(String[] args){
		Assignment4 assignment4 = new Assignment4();
		assignment4.setPrimaryInfo("Onkar", "Patil");
		assignment4.setOtherInfo("Dassault Systems", "Pune", 411057);
		assignment4.printAllDetails();
	}
}
