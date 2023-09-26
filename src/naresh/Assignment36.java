package naresh;

public class Assignment36 {
	void swapInput(String[] input) {
		String temp =input[0];
		String a = input[1];
		String b= input[2];
		String c = input[3];
		temp=input[3];
		a=input[1];
		b=input[2];
		c=input[0];
		System.out.println(temp);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}
	
	
	

	public static void main(String[] args) {
		Assignment36 a = new Assignment36();
		String[] names = {"Sayli", "deepak", "Nivedita", "Yogesh"};
		
		a.swapInput(names);
	}

}
/*
 * Assignment-36 : 26th Sep'2023 Swap first and last element of an array, print
 * it to confirm swap operation. input : { "Sayli", "deepak", "Nivedita",
 * "Yogesh"} output : { "Yogesh", "deepak", "Nivedita","Sayli"}
 */