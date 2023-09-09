class Example199{
	
	void processData(int startRange, int endRange){
		
		/*for(int num=startRange;num<=endRange;num++){
			if(num%5==0){
				System.out.println(num);
			}
		}*/
		
		for(int num=endRange;num<=startRange;num--){
			if(num%5==0){
				System.out.println(num);
				System.out.println("mod 5");
				break;//break always break for loop not if conditions[condition is satisfy 1time
			}
		}
		
	}
	
	void processData1(int startRange, int endRange){
		
		for(int num=startRange;num<=endRange;num++){
			if(num%5==0 &&  num%7==0){
				System.out.println(num);
				System.out.println("5,7");
				break;//break always break for loop not if conditions[condition is satisfy 1time
			}System.out.println(num);
		}
		
	}
	
	
	void processData2(int startRange, int endRange){
		int sum=0;
		for(int num=startRange;num<=endRange;num++){
			
			if(num%5==0){
				sum= sum +num;
				break;//break always break for loop not if conditions[condition is satisfy 1time
			}
		
				System.out.println(num);
				System.out.println("In the range" + startRange +"-"+ endRange + "sum: " +sum);
		}
	
	}
	
	
	public static void main(String[] args){
		Example19 example19 = new Example19();
		example19.processData(1,98);
		example19.processData1(1000,1018);
		example19.processData2(1000,1018);
		
		
	}
	
	
	
}