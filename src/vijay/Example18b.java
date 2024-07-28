package vijay;

class Example18b{

	void printNameRevLoop(String name){
		for(int index=5; index>=1; index--){
			System.out.println(name+"-"+index);
		}
			System.out.println("Techno");
	}
	
	public static void main(String[] args){
		Example18b example18b = new Example18b();
		example18b.printNameRevLoop("Maulik");
	}
}

// above Example18b is of reverse loop type.
// press Control+C to stop the infinite loop in cmd. (if we use index++ in above Example18b)