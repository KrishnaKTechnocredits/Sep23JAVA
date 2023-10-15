package technoCredits.interview;

public class BlockExample {

	static{
		System.out.println("Hi");
	}
	
	{
		System.out.println("GM");
	}
	
	public BlockExample() {
		System.out.println("Pune");
	}
	
	public static void main(String[] args) {
		BlockExample ex1 = new BlockExample();
		BlockExample ex2 = new BlockExample();
	}
}
