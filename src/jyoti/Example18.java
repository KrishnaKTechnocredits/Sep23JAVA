class Example18{

		void printName(String name){
			for(int index=1;index <=5;index++){
			System.out.println(name + "-" + index);
			}
			System.out.println("Techno");
		}
		
		void printNameWithControlledLoop(int startIndex , int endIndex){
			for(int num=startIndex;num <=endIndex;num++){
				if (num%5==0){
					System.out.println(num);
				}
			}
			
		}
		
		void printNameRevLoop(String name){
			for(int index=5;index >=1;index--){
			System.out.println(name + "-" + index);
			}
			System.out.println("Techno");
		}
		
	public static void main(String[] args){
		Example18 example18= new Example18();
		example18.printName("Jyoti");
		example18.printNameRevLoop("Saxena");
		example18.printNameWithControlledLoop(100,150);
		System.out.println("=====================================");
		example18.printNameWithControlledLoop(500,538);
		}

}
