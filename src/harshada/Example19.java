package harshada;
class Example19{

	void processData(int startRange, int endRange){
		for(int num=endRange;num>=startRange;num--){
			if(num%5==0){
				System.out.println(num);
				break;
			}
		}
	}


	void processData1(int startRange, int endRange){
		for(int num=startRange;num<=endRange;num++){
			if(num%5==0 && num%7==0){
				System.out.println(num);
				break;
			}
		}
	}
	
	void processData2(int startRange, int endRange){
		int sum=0;
		for(int num=startRange;num<=endRange;num++){
			if(num%5==0){
				sum = sum + num;
			}
		}
		System.out.println("In the range" + startRange + "-" + endRange + ", Sum of all the numbers which are div by 5 is, " + sum);
	}
	
	void processData3(int startRange, int endRange){
		int count=1;
		for(int num=startRange;num<=endRange;num++){
			if(num%5==0){
				count=count+1;
				if(count==5){
					System.out.println(num);
					break; //statement
				}
			}
		}
	}
	
	void processData4(int startRange, int endRange){
		int expectedNum = 0;
		for(int num=startRange;num<=endRange;num++){
			if(num%5==0){
				expectedNum = num;
			}
		}
		System.out.println(expectedNum);
	}
	
	public static void main(String[] args){
		Example19 example19 = new Example19();
		example19.processData(1,98);
	}		
}

//sum

