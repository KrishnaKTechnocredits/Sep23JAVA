package vijay;

class Example20{

	void printNumDivByFive(int startRange, int endRange){
		int count=1;
		for (int num=startRange; num<=endRange; num++){
			if(num%5==0){
				System.out.println(num);
				if(count==5){
					break;
				}
				count++;
			}
		}
	}
	
	public static void main(String[] args){
		Example20 example20 = new Example20();
		example20.printNumDivByFive(1,100);
	}
}

// from above Example20 Session-7_Loop_Condition started.
// Question for above Example20 : Print 1st 5 num divisible by 5 from 1-100.
// if we don't break above Example20 loop then also it will print first 5 num only, but will process the loop till 100. so to time complexity we are using break so that it will come out of loop after 1st 5 nums.

