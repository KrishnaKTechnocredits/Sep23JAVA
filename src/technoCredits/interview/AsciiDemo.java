package technoCredits.interview;

//65 to 90 : Uppercase
// 97 to 122 : lowercase
// 48 to 57 : digits

public class AsciiDemo {
	
	void printAscii() {
		int x = 'A'; // 4 
		float f = 65;
		double y = 65;
		
		String str = "Tec,hno,cre,di,ts";
		int temp = ','; // 42
		int count = 0;
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index) == temp) {
				count++;
			}
		}
		System.out.println("count of , = " + count);
	}
	
	void processData() {
		char ch = 'A';
		int num1 = ':';
		int num = 10; 
		System.out.println(num1);
		System.out.println(num + ch);
	}
	
	int sumOfDigits() {
		int sum = 0;
		String input = "Tec3hno5credi8ts";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum = ch + sum;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		AsciiDemo asciiDemo = new AsciiDemo();
		asciiDemo.printAscii();
		int ans = asciiDemo.sumOfDigits();
		System.out.println(ans);
		
	}
}
