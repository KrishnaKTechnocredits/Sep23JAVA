/* Assignment-18 : 8th Sep'2023 On user defined range print sum and average of numbers which is divisible by 5 & 7. Hint : pass start and end index as a parameter. 
Input : Range -> 1 to 110 Output :
     Numbers are,           
     35 70 105 
	 Found 3 numbers which are divible by 5 & 7.
	 sum = 210
	 Avearge = 70  */

package nivedita;	 
class A18SumAvg{
	
	void divisibleNumb(int StartRange,int EndRange){
		
		int sum=0;
		int average=0;
		int total=0;
		
		System.out.println("Numbers are, ");
		for(int number=StartRange;number<=EndRange;number++){
			if(number%5==0 && number%7==0){
				System.out.println(" "+number);
				total++;
				sum=sum+number;
			}
		}
		if(sum!=0 && total!=0){
			average=sum/total;
		}
		System.out.println("Found "+total+" numbers which are divisible by 5 & 7");
		System.out.println("sum = "+sum);
		System.out.println("Average = "+average);
	}
	
	public static void main(String[] args){
		A18SumAvg sumAvg = new A18SumAvg();
		sumAvg.divisibleNumb(1,110);
	}
}	 