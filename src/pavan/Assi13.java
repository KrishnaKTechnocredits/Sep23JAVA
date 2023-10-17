package pavan;

public class Assi13 {
	void processData(int startIndex, int endIndex){
		for(int index = endIndex ; index >= startIndex ; index--){
			if(index % 7==0)
				System.out.println(index+ " is devision by 7");
			else if(index % 13==0)
				System.out.println(index+ " is division by 13");
		}
	}
	
	public static void main(String[] args){
		Assi13 assi13 = new Assi13();
		assi13.processData(5,40);
	}
}
