package technoCredits;

public class Example24 {
	
	void processData() {
		int num = 1;
		int count = 10;
		int temp = ++num + count++ +  num++ + --num + 5 + --count + --count;
		System.out.println(temp);
		System.out.println(num);
		System.out.println(count);
		System.out.println(temp + num + count + "Answer is " + temp + num + count);
	}
	
	public static void main(String[] args) {
		Example24 example24 = new Example24();
		example24.processData();
	}
}
