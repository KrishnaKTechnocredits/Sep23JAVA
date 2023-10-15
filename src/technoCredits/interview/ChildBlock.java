package technoCredits.interview;

public class ChildBlock extends ParentBlock{
	
	static {
		System.out.println("CSB");
	}
	
	{
		System.out.println("CNSB");
	}
	
	ChildBlock(){
		int x = 10;
		System.out.println("CC");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		ParentBlock pb = new ChildBlock();
	}
}
