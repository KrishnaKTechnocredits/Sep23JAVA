package jagrati;

//Assignment - 11 : 7th Sep'2023
//Write only one program having the following methods.

class ForLoopProgram{
	
	void evenNumber(int passStart, int endIndex){//
		for (int num = passStart; num<=endIndex; num++){
			if (num%2==0){
				System.out.println(num);
			}
		}		
	}
	
	void rangDivisible(int passStart, int endIndex){
		for(int num = passStart; num<=endIndex; num++){
			if (num%5==0 && num%3==0){
				System.out.println(num);
			}
		}
	}
	
	void reverseOrder(int passStart, int endIndex){
		for(int num = endIndex; num>=passStart; num--){
			if (num%7==0){
				System.out.println(num + " is divisible by 7");
			}else if (num%13==0){
				System.out.println(num + " is divisible by 13");
			}
		}
	}
	
	void printLastNumber(int passStart, int endIndex){
		for(int num = endIndex; num>=passStart; num--){
			if (num%5==0 && num%9==0){
				System.out.println("Last number divisible by 5 & 9 is " + num);
				break;
			}
		}
	}
	
	void sumOfDivisible(int passStart, int endIndex){
		int sum = 0;
		for(int num = passStart; num<=endIndex; num++){
			if (num%5==0 && num%10==0){
				sum = sum + num;
			}
		}System.out.println("sum of all the number which is divisible by 5 & 10 is " + sum);
		
	}
	
	void numberDivisible(int passStart, int endIndex){
		int count=1;
		for(int num = passStart; num<=endIndex; num++){
			if (num%3==0 && num%4==0){
				count = count + 1;
				if (count == 4){
					System.out.println(num);
				}
			}
		}
	}
	
	public static void main(String [] args){
		ForLoopProgram loopProgram = new ForLoopProgram();
		System.out.println("==========First Method Result============");
		loopProgram.evenNumber(10,15);
		System.out.println("==========Second Method Result============");
		loopProgram.rangDivisible(5,40);
		System.out.println("==========Third Method Result============");
		loopProgram.reverseOrder(5,40);
		System.out.println("==========Fourth Method Result============");
		loopProgram.printLastNumber(5,100);
		System.out.println("==========Fifth Method Result============");
		loopProgram.sumOfDivisible(10,50);
		System.out.println("==========Sixth Method Result============");
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		loopProgram.numberDivisible(10,500);
	}
}