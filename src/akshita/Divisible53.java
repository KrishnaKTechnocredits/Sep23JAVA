package akshita;

class Divisible53{

	void evenNumber(int startIndex, int endIndex){
		int index ;
		for(index = startIndex ; index<=endIndex ;index++){
			if(index%5 ==0 && index%3 ==0){
				System.out.println(index);
			}
			}
		if(startIndex>endIndex){
			System.out.println("Invalid");
	    }
		
    }
	
	public static void main(String[] args){
		Divisible53 divisible53 = new Divisible53();
		System.out.println("Even Number are:");
		divisible53.evenNumber(5,40);
		divisible53.evenNumber(50,40);
		
	}
}



