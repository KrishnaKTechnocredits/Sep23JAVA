package rahul;

class Assignment13_Div7Or13Rev {
	
	void div7Or13(int startRange, int endRange) {
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for (int index = endRange; index >= startRange; index--) {
			if (index%13 == 0) {
				System.out.println(index + " is divisible by 13");
			}
			else if (index%7 == 0) {
				System.out.println(index + " is divisible by 7");
			}
		}
	}
	
	public static void main (String args[]) {
		Assignment13_Div7Or13Rev assignment13_div7Or13Rev = new Assignment13_Div7Or13Rev();
		assignment13_div7Or13Rev.div7Or13(5,40);
	}
}