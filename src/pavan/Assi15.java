package pavan;

public class Assi15 {
	void sum(int startIndex, int endIndex){
		int sum = 0;
		for(int index = startIndex ; index <= endIndex ; index++){
			if(index % 5==0 && index % 10==0){
				sum = sum + index;
			}
		}
		System.out.println("Sum of number is division by 5 and 10 in the givin range is "+sum);
	}
	
	public static void main(String[] args){
		Assi15 assi15 = new Assi15();
		assi15.sum(10,50);
	}
}
