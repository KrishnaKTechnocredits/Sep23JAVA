package hetal;

class Divideby{
	
	void printdividebynum(int startIndex, int endIndex){
		for (int num = endIndex; num>= startIndex; num--){
			if(num%7 == 0 ){
				System.out.println("Number divide by " + 7 + " is " + num);
			}                                                              
			else if(num%13 == 0){
				System.out.println("Number divide by " + 13 + " is " + num);
		    }
		}
	}
	public static void main(String args[]){
        Divideby divideby = new Divideby();
        divideby.printdividebynum(5,40);
	} 
}	