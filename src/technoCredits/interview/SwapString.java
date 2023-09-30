package technoCredits.interview;

public class SwapString {

	public static void main(String[] args) {
		String name1 = "Jyoti";
		String name2 = "Hetal";
		
		System.out.println("Before --> " + name1 + ":" + name2);
		String temp = name1; // Jyoti
		name1 = name2; // Hetal 
		name2 = temp; // Jyoti
		System.out.println("After --> " + name1 + ":" + name2);
		
		
	}
}
