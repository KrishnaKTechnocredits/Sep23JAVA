/*Using scanner class, take 2 inputs from user and ask user which operation they would like to 
perform , accordingly call methods of calculator.
input : 
enter input 1 : 23
enter input 2 : 20

which operation you want to perform, valid operations are [add,sub,mul,div].
add

output : sum of 23 and 20 is 43*/

package gaurang;
import java.util.Scanner;
public class Assignment59 {

	void getCalc(String input, int x, int y) {
		if(input.equals("add")) {
			int sum = x + y;
			System.out.println("sum of "+x+" and "+y+" is "+sum);
		}
		else if(input.equals("sub")) {
			int sum = x - y;
			System.out.println("sub of "+x+" and "+y+" is "+sum);
		}else if(input.equals("mul")) {
			int sum = x * y;
			System.out.println("mul of "+x+" and "+y+" is "+sum);
		}else if(input.equals("div")) {
			int sum = x / y;
			System.out.println("div of "+x+" and "+y+" is "+sum);
		}
	}
	
	public static void main(String[] args) {
		Assignment59 a = new Assignment59();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input 1 : ");
		int x = sc.nextInt();
		System.out.println("enter input 2 : ");
		int y = sc.nextInt();
		System.out.println("which operation you want to perform, valid operations are [add,sub,mul,div]");
		String input = sc.next();
		a.getCalc(input,x,y);
		sc.close();
	}
}
