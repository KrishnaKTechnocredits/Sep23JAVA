package vijay;

class Example18c{

	void printNameWithControlledLoop(int startIndex, int endIndex){
		for(int num=startIndex; num<=endIndex; num++){
			if (num%5==0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
		Example18c example18c = new Example18c();
		example18c.printNameWithControlledLoop(100,150);
		System.out.println("==============");
		example18c.printNameWithControlledLoop(500,538);
	}
}