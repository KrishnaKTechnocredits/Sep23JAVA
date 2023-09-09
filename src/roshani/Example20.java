package roshani;

class Example20{
	
	void printNumDivByFive(int startRange, int endRange){
		int count = 1;
		for(int num=startRange;num<=endRange;num++){
			if(num%5==0){
				System.out.println(num);
				if(count==5){
					break;
				}
				count++;
			}
		}
	}
	
	// 1 to 100
	void printNumDivByFive1(int startRange, int endRange){
		int count = 1;
		for(int num=startRange;num<=endRange;num++){
			if(num%5==0){
				if(count==7){
					System.out.println(num);
					break;
				}
				count++;
			}
		}
	}
	
	void printNumDivByFive2(int startRange, int endRange, int nthLast){
		int count = 1;
		for(int num=endRange;num>=startRange;num--){
			if(num%5==0){
				if(count==nthLast){
					System.out.println(num);
					break;
				}
				count++;
			}
		}
	}

	void proccessData0(int startRange, int endRange){
		int count = 1;
		for(int num=endRange;num>=startRange;num--){
			if(num%5==0){
				if(count==2){
					System.out.println(num);
					System.out.println(num-1);
					System.out.println(num-2);
					break;
				}
				count++;
			}
		}
	}
	
	// 1 - 100 : 95,90,85
	void proccessData(int startRange, int endRange){
		int count = 1;
		int temp = 1;
		for(int num=endRange;num>=startRange;num--){
			if(num%5==0){
				if(count>=2){
					System.out.println(num);
					if(temp==3)
						break;
					temp++;
				}
				count++;
			}
		}
	}
	
	//100 95 90
	void proccessData1(int startRange, int endRange){
		int count = 0;
		int sum = 0;
		for(int num=endRange;num>=startRange;num--){
			if(num%5==0 && count<3){
				sum = sum + num;
				count++;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		Example20 example20 = new Example20();
	}
}