package rahul;

class Assignment12_Div5And3 {

	void div5And3(int startRange, int endRange) {
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for (int index = startRange; index <= endRange; index++) {
			if (index%3 == 0 && index%5 == 0) {
				System.out.println(index);
			}
		}
	}
	
	public static void main(String args[]) {
		Assignment12_Div5And3 assignment12_div5And3 = new Assignment12_Div5And3();
		assignment12_div5And3.div5And3(5, 40);
	}
}