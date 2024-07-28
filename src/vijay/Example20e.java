package vijay;

class Example20e{

	void printNumDivByFive(int startRange, int endRange){
		int count=1;
		for (int num=endRange; num>=startRange; num--){
			if(num%5==0){
				if(count>=2 && count<=4){
					System.out.println(num);
					if(count==4){
						break;
					}
				}
				count++;
			}
		}
	}
	
	public static void main(String[] args){
		Example20e example20e = new Example20e();
		example20e.printNumDivByFive(1,100);
	}
}

// Q 20e : print last 2nd, 3rd and 4th num divisible by 5.

// YOU HAVE TO FIND WHY WE WROTE COUNT++ AFTER 2 BRACKETS ONLY.