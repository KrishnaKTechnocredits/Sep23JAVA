class Example20{

	void printNumDivby5(int startRange , int endRange){
		int count=1;
		for(int num=startRange;num<=endRange;num++){
			
			if(num%5==0){
				
				system.out.println(num);
				if(count==5){
					
					break;
				}
					count++;
			}
			
		}
	}


	void printNumDivby5Only7th(int startRange , int endRange){
		int count=1;
		for(int num=startRange;num<=endRange;num++){
			
			if(num%5==0){
				
				if(count==7){
					system.out.println(num);
					break;
				}
					count++;
			}
			
		}
	}
	
	
	void printNumDivby5Last7th(int startRange , int endRange , int nthLast){
		int count=1;
		for(int num=endRange;num>=startRange;num--){
			
			if(num%5==0){
				
				if(count==nthLast){
					system.out.println(num);
					break;
				}
					count++;
			}
			
		}
	}
	
	
	void printNumDivby5SumAvg(int startRange , int endRange , int nthLast){
		int count=1;
		for(int num=endRange;num>=startRange;num--){
			
			if(num%5==0){
				
				if(count==nthLast){
					system.out.println(num);
					break;
				}
					count++;
			}
			
		}
	}
	
	
	void printNumDivby5SumAvg(int startRange , int endRange){
		int count=1;
		for(int num=endRange;num>=startRange;num--){
			
			if(num%5==0){
				
				if(count==2){
					system.out.println(num);
					system.out.println(num-1);
					system.out.println(num-2);
					break;
				}
					count++;
			}
			
		}
	}
	
void processData(int startRange , int endRange ){
		int count=1;
		int temp=1;
		for(int num=endRange;num>=startRange;num--){
			
			if(num%5==0){
				
				if(count>=2 && coun<=4){
					system.out.println(num);
					
					break;
				}
					count++;
			}
			
		}
	}	
	
//1+2+3+4+5+6+7=(7*8)/2	=28/2=14[avg]
//1->50
//3 &5 ->15+30+45=90/3

if(num%3==0 && num%5==0){
	sum=sum+num;
	count++;
}

	public static void main(String[] args){
		Example20 numDiv=new Example20();
		numDiv.printNumDivby5(1,50);
		numDiv.printNumDivby5Only7th(1,50);
}	
	
}	
	