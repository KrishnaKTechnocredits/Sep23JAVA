package rahul;

class Assignment11_EvenNos {
	
	void evenNos (int startRange, int endRange) {
		System.out.println("Even nos are: ");
		for (int index = startRange; index <= endRange; index++) {
			if (index%2 == 0){
				System.out.println(index);
			}
		}
	}
	
	public static void main (String args[]) {
		Assignment11_EvenNos assignment11_evenNos = new Assignment11_EvenNos();
		assignment11_evenNos.evenNos(10, 15);
	}
}