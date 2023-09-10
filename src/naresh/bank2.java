package naresh;

class Bank2{
	
	String firstName;
	String lastName;
	String cmpName;
	String cityName;
	int pincode;
	
	void setPrimaryInfo(String firstName1,String lastName1){
	  firstName=firstName1;
	  lastName=lastName1;
	  }
	  
	void setOtherInfo(String cmpName1,String city1,int pincode1){
	  cmpName=cmpName1;
	  cityName=city1;
	 pincode=pincode1;
	  
	  }
	void printAllDetails(){
	  System.out.println("First name is  "+firstName);		
	  System.out.println("Last name is  "+lastName);		
	  System.out.println("Company name is  "+cmpName);		
	  System.out.println("City name is  "+cityName);		
	  System.out.println("Pincode name is  "+pincode);
	}
		  
	public static void main (String[]args){
      Bank2 bank=new Bank2();
      bank.setPrimaryInfo("Naresh","Baghel");
	  bank.setOtherInfo("Deutche","Jaipur",303002);
	  bank.printAllDetails();	
	}
	
	
	
}
	  