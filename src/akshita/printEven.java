package akshita;

class PrintEven{

	void evenNumber(int startIndex, int endIndex){
		int index ;
		System.out.println("Even Number are:");
		for(index = startIndex ; index<=endIndex ;index++){
			if(index%2 ==0){
				System.out.println(index);
			}
	    }
    }
	
	public static void main(String[] args){
		PrintEven printEven = new PrintEven();
		printEven.evenNumber(10,15);
	}
}