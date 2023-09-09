package rahul;

class Assignment14_Div5And9_LastNo {
	
	void div5And9(int startRange, int endRange) {
		for (int index = endRange; endRange >= startRange; index--) {
			if (index%5== 0 && index%9 == 0) {
				System.out.println("Last number divisible by 5 & 9 is: " + index);
				break;
			}
		}
	}
	
	public static void main (String args[]) {
		Assignment14_Div5And9_LastNo assignment14_Div5And9_lastNo = new Assignment14_Div5And9_LastNo();
		assignment14_Div5And9_lastNo.div5And9(5,100);
	}
}

