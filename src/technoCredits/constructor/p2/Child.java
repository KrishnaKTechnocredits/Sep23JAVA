package technoCredits.constructor.p2;

public class Child extends Parent{
	
	{
		System.out.println(5);
	}
	
	Child() {
		super("Hi");
		System.out.println(4);
	}
	
	Child(boolean b) {
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		Child c = new Child(true); 
	}
}
