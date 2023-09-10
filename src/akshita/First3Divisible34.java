package akshita;

class First3Divisible34{
	void evenNumber(int startIndex, int endIndex){
		int index ;
		int count=0;
		for(index = startIndex ; index<=endIndex ;index++){
			if(index%3 ==0 && index%4 ==0){
				{
					System.out.println("First three number which is divisible by  3 & 4 are " + index);
					count = count + 1;
						if(count>2){
							break;
						}
				}
			}
			
		}	
    }	
	public static void main(String[] args){
		First3Divisible34 first3Divisible34 = new First3Divisible34();
		first3Divisible34.evenNumber(10,500);
	}
}