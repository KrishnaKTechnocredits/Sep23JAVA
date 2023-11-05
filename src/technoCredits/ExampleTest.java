package technoCredits;

public class ExampleTest {
	
	public static void main(String[] args) {
		int[] num1 = {10,20,30};
		int[] num2 = num1;
		
		num2[0] = 100;
		int sum = 0;
		for(int index=0;index<num1.length;index++) {
			sum = sum + num1[index];
		}
		System.out.println(sum);
	}
}
