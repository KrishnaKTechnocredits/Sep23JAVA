package rabish;
class Assignment16 {
		
		void firstThreeNumbers(int startIndex,int endIndex){
		int count=0;
			for(int i=startIndex;i<=endIndex;i++){
				if (i%3==0 && i%4==0)
					{
						System.out.println("First 3 numbers divisible by 3 and 4 is :"+i);
					if(count==2){
						break;
						}
					count++;
				}
		}
	}
				
		public static void main(String[] args){
			Assignment16 loop3=new Assignment16();
			loop3.firstThreeNumbers(10,500);
		}
	}

