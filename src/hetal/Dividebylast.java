package hetal;

class Dividebylast{
	
	void printdividebylastnum(int startIndex, int endIndex){
		for (int num = endIndex; num>= startIndex; num--){
			if(num % 5 == 0 && num % 9 ==0){
				System.out.println(" last number divide by " + 5 + " and " + 9 + " in given range is " + num);
				break;
		    }
		}
	}
	public static void main(String args[]){
        Dividebylast dividebylast = new Dividebylast();
        dividebylast.printdividebylastnum(5,100);
	} 
}	