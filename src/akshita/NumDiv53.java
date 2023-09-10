package akshita;

class NumDiv53{

	void evenNumber(int startIndex, int endIndex){
		int index ;
		System.out.println("Even Number are:");
		for(index = startIndex ; index<=endIndex ;index++){
			if(index%5 ==0 && index%3 ==0){
				System.out.println(index);
			}
	    }
    }
	
	public static void main(String[] args){
		NumDiv53 numDivBy53 = new NumDiv53();
		numDivBy53.evenNumber(5,40);
	}
}
