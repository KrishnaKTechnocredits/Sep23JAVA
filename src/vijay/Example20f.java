package vijay;

class Example20f{

	void printNumDivByFive(int startRange, int endRange){
		int count=1;
		int temp=1;
		for (int num=endRange; num>=startRange; num--){
			if(num%5==0){
				if(count>=2){
					System.out.println(num);
					if(temp==3){
						break;
					}
				}
				temp++;
				count++;
			}
		}
	}
	
	public static void main(String[] args){
		Example20f example20f = new Example20f();
		example20f.printNumDivByFive(1,100);
	}
}

// Q 20f : print last 2nd, 3rd and 4th num divisible by 5.
// Example20e can also be answered in this way like Example20f by using temp.

// YOU HAVE TO FIND WHY WE WROTE COUNT++ AND TEMP++ AFTER 2 BRACKETS ONLY.

