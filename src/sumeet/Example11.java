package sumeet;

class Example11{
	int total;
	String name;
	
	void processData(int num1, int num2, String name, int num3){
		total=num1+num2+num3;
		name= "Credits";
	}
	
	void display(){
		System.out.println(total);
		System.out.println(this.name);
	}
	
	public static void main(String[] args){
		Example11 example11= new Example11();
		example11.processData(10, 30, "Sumit", 50);
		example11.display();
	}
}