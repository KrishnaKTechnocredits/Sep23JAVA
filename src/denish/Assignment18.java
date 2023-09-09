package denish;

class Assignment18{

		void sumAvg(int startIndex, int endIndex){
			int sum=0;
			int avg=0;
			
			
			for(int num=startIndex ; num<=endIndex ; num++){
				if(num%5==0 && num%7==0){
					System.out.println("Number of division by 5 and 7 is : "+num);
					sum= sum+num;
					avg++;
					
				}
			}
			System.out.println("Sum of number is : "+sum);
			System.out.println("Average of number is : "+ (sum / avg));
		}
		
		public static void main(String[] args){
			Assignment18 assignment18 = new Assignment18();
			assignment18.sumAvg(1,110);
		}
}