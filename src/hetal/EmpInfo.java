package hetal;

class EmpInfo{
	String firstName;
	String lastName;
	String cmpName;
	String city;
	int pincode;
	
	void setPrimaryInfo(String fn, String ln){
		firstName = fn;
		lastName = ln;
	}
	
	void setOtherInfo( String cmpN, String ct, int pinc){
		 cmpName = cmpN;
		 city = ct;
		 pincode = pinc;      		 
	}
	
	void printAlldetails(){
		System.out.println("firstName is " + firstName);
		System.out.println("lastName is " + lastName);
		System.out.println("compny name is " + cmpName);
		System.out.println("city is " + city);
		System.out.println("pincode is " + pincode);
	}
	
	public static void main(String[] args){
		EmpInfo empInfo = new EmpInfo();
		empInfo.setPrimaryInfo("Hetal","Virani");
		empInfo.setOtherInfo("Tech","ahemdabad",360370);
		empInfo.printAlldetails();
		
	}
	
}