package vijay;

class Example18a{

	void printName(String name){
		for(int index=1; index<=5; index++){
			System.out.println(name+"-"+index);
		}
			System.out.println("Techno");
	}
	
	public static void main(String[] args){
		Example18a example18a = new Example18a();
		example18a.printName("Maulik");
	}
}