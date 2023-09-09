package technoCredits;

class Example12{
	
	void processData(int num1, int num2, String name, int num3){
		int total = num1 + num2 + num3;
		int answer;
		System.out.println("Hi");
		answer = 5;
		System.out.println("Hello");
		answer = answer + total + 2;
		System.out.println(answer); //
	}
	
	public static void main(String[] args){
		Example12 example12 = new Example12();
		example12.processData(10,11,"Techno",12);
	}
}