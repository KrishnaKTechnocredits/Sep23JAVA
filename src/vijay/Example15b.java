package vijay;

class Example15b{

	void processData(int dayIndex){
		if (dayIndex==1){
			System.out.println("Monday");
			System.out.println("Credits");

		}else{
			System.out.println("Techno");
		}
	}
	
	public static void main (String[] args){
		Example15b example15b = new Example15b();
		example15b.processData(2);
	}
}

// for more than one SOP statements {} are compulsory in if elase block.