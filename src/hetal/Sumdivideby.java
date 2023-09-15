package hetal;

class Sumdivideby{
	
	void printsumdivideby(int startIndex, int endIndex){
		int sum = 0;
		for (int num = startIndex; num<= endIndex; num++){
			if(num % 5 == 0 && num % 10 ==0){
				sum = sum + num;
		    }
		}
		System.out.println("Expected sum is " + sum);
	}
	public static void main(String args[]){
        Sumdivideby sumdivideby = new Sumdivideby();
        sumdivideby.printsumdivideby(10,50);
	} 
}	