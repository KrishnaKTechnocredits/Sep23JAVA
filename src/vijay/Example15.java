package vijay;

class Example15{

	void processData(int dayIndex){
		if (dayIndex==1)
			System.out.println("Monday");
			System.out.println("Techno");
	}
	
	public static void main (String[] args){
		Example15 example15 = new Example15();
		example15.processData(2);
	}
}

// if one if block has one SOP statement the it doesn't require {}, and next SOP statement would become independant. but best practice says always use {}.
