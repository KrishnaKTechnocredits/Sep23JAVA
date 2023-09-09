package technoCredits;

class Example11{
	int total;
	String name;
	
	void processData(int num1, int num2, String name, int num3){
		int total = num1 + num2 + num3;
		name = "Credits"; // 6
	}
	
	void display(){
		System.out.println(total); // 0
		System.out.println(this.name); // null
	}
	
	public static void main(String[] args){
		Example11 example11 = new Example11();
		example11.processData(10,11,"Techno",12);
		example11.display();
	}
}