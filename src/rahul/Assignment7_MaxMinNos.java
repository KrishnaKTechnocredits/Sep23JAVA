package rahul;

class Assignment7_MaxMinNos {
	void findsMaxNum(int num1, int num2) {
		if (num1 > 0 && num2 > 0 && num1 < num2) {
			System.out.println(num2 + " is bigger between " + num1 + " and " + num2);
		}
		else if (num1 < 0 && num2 < 0 || num1 < 0 || num2 < 0) {
			System.out.println("Please enter numbers greater than 0");
		}
		else {
			System.out.println(num1 + " & " + num2 + " are equal");
		}
	}
	
	void findsMinNum(int num1, int num2) {
		if (num1 > 0 && num2 > 0 && num1 < num2) {
			System.out.println(num1 + " is smaller between " + num1 + " and " + num2);
		}
		else if (num1 < 0 && num2 < 0 || num1 < 0 || num2 < 0) {
			System.out.println("Please enter numbers greater than 0");
		}
		else {
			System.out.println(num1 + " & " + num2 + " are equal");
		}
	}
	
	public static void main (String args[]) {
		Assignment7_MaxMinNos assignment7_maxMinNos = new Assignment7_MaxMinNos();
		assignment7_maxMinNos.findsMaxNum(10,17);
		assignment7_maxMinNos.findsMinNum(10,17);
		assignment7_maxMinNos.findsMaxNum(10,10);
		assignment7_maxMinNos.findsMaxNum(-10,5);
		assignment7_maxMinNos.findsMaxNum(-10,-10);
		assignment7_maxMinNos.findsMaxNum(5,-10);
		assignment7_maxMinNos.findsMinNum(17,17);
		assignment7_maxMinNos.findsMinNum(-20,5);
		assignment7_maxMinNos.findsMinNum(-20,-20);
		assignment7_maxMinNos.findsMinNum(6,-10);
		
	}
}