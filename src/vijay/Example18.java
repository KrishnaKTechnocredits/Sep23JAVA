package vijay;

class Example18{

	void printName(String name){
		for(int index=1; index<=5; index++){
			System.out.println(name);
			System.out.println("Techno");
		}
	}
	
	public static void main(String[] args){
		Example18 example18 = new Example18();
		example18.printName("Maulik");
	}
}


// Learning
// here from Example18 lecture Session - 6 For_loop started.
// for( Initialization/start; Condition/end; Increament/Decreament  ){
//	}
//for loop requires 1. Initialization/start i=1/i=10; 2. Condition/end i<=10/i>0; 3. Increament/Decreament i=i+1/i=i-1;
// indix= index+1 can be written as index++; index= index+2 cannot be written as index++
// index= index-1 can be written as index--; index= index-2 cannot be written as index--
// index++ / index-- are called as post increament/decreament.
// ++index / --index are called as pre increament/decreament.
// in for loop it is ok if we dont use curly bracket{} for single statement, but for best practices we will use curly brackets{}.
// in for loop for multiple statement always usse curly brackets{}.
