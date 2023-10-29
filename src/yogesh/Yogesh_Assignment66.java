//WAP to return reverse number without converting it to String.
//
//input : 123
//output : 321

package yogesh;

public class Yogesh_Assignment66 {

	
	int revString(int num) {
		int output=0;
		while(num!=0) {
			int a=num%10;
			output=output*10+a;
			num=num/10;
		}
		return output;
	}
	
	public static void main(String[] args) {
		Yogesh_Assignment66 assignment66=new Yogesh_Assignment66();
	int	input = 123;
	int output=	assignment66.revString(input);
	System.out.println("Output for given input ->"+input+" is-->"+output);
	}
}
