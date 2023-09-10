//Assignment 11-16
package jaykumar;

class Numbers{
	
	void evenNum(int startRange, int endRange){
		System.out.println("Even numbers in range "+startRange+" to "+endRange+" are ");
		for(int index=startRange; index<=endRange; index++){
			int num=index;
			if(num%2==0){
				System.out.println(num);
			}
		}
		System.out.println("\n");
	}
	
	void div5And3(int startRange, int endRange){
		System.out.println("Numbers divisible by 5 and 3 in range "+startRange+" to "+endRange+" are ");
		for (int index=startRange; index<=endRange; index++){
			int num=index;
			if(num%5==0 && num%3==0){
				System.out.println(num);
			}
		}
		System.out.println("\n");
	}
	
	void div7Or13(int startRange, int endRange){
		System.out.println("Numbers divisible by 7 or 13 in range "+startRange+" to "+endRange+" are ");
		for(int index=endRange; index>=startRange; index--){
			int num=index;
			if(num%7==0){
				System.out.println(num+" is divisible by 7");
			} else if(num%13==0){
				System.out.println(num+" is divisible by 13");
			}
		}
		System.out.println("\n");
	}
	
	void div5And9(int startRange, int endRange){
		for(int index=endRange; index>=startRange; index--){
			int num=index;
			if(num%5==0 && num%9==0){
				System.out.println("Last number divisible by 5 & 9 in range "+startRange+" to "+endRange+" is "+num);
				break;
			}
		}
		System.out.println("\n");
	}
	
	void sumDiv5And10(int startRange, int endRange){
		int sum=0;
		for(int index=startRange; index<=endRange; index++){
			int num=index;
			if(num%5==0 && num%10==0){
				sum=sum+num;	
			}
		}
		System.out.println("Sum of all numbers divisible by 5 and 10 in range "+startRange+" to "+endRange+" is "+sum);
		System.out.println("\n");
	}
	
	void numDiv3And4(int startRange, int endRange){
		int count=0;
		System.out.println("First 3 numbers divisible by 3 and 4 in range "+startRange+" to "+endRange+" are ");
		for(int index=startRange; index<=endRange; index++){
			int num=index;
			if(num%3==0 && num%4==0){
				count++;
				System.out.println(num);
				if(count==3){
					break;
				}
			}
		}
	}
			
	public static void main(String[] args){
		Numbers numbers = new Numbers();
		numbers.evenNum(10,15);
		numbers.div5And3(5,40);
		numbers.div7Or13(5,40);
		numbers.div5And9(5,100);
		numbers.sumDiv5And10(10,50);
		numbers.numDiv3And4(10,500);
	}
}