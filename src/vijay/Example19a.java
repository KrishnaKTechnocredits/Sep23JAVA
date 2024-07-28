package vijay;

class Example19a{

	void processData(int startRange, int endRange){
		for(int num=endRange; num>=startRange; num--){
			if (num%5==0){
				System.out.println(num);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		Example19a example19a = new Example19a();
		example19a.processData(1,98);
	}
}

// break can only be used with for loop, as shown in above Example19a.
// break is used to break the loop and come out of the loop only.
// break statement used to come out of loop only not out of method. whatever is written out of for loop will get executed.
// 
