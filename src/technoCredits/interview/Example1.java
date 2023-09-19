package technoCredits.interview;

public class Example1 {
	
	int x = 10;
	static int y = 20;
	
	void processData() {
		x++; // x == x+1;
		y++; // y = y+1;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		Example1 e1 = new Example1();
		e1.processData();
		e1.processData();
		e1.processData();
		e1.display();
		
		Example1 e2 = new Example1();
		e2.processData();
		e2.display();
	}
}

// 13 23
// 11 24