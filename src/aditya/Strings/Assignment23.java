package aditya.Strings;

class Assignment23 {
	void display(String input) {
		int ucount = 0;
		int lcount = 0;
		int dcount = 0;
		int scount = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index))) {
				ucount++;
			} else if (Character.isLowerCase(input.charAt(index))) {
				lcount++;
			} else if (Character.isDigit(input.charAt(index))) {
				dcount++;
			} else {
				scount++;
			}
		}
		System.out.println(input+ " UpperCase letter Count is--> " + ucount);
		System.out.println(input+ " LowerCase letter Count is--> " + lcount);
		System.out.println(input+ " digit Count is--> " + dcount);
		System.out.println(input+ " Special Character Count is--> " + scount);

	}

	public static void main(String[] args) {

		Assignment23 up = new Assignment23();
		up.display("TecHNo_cR6ediTs");
	}
}