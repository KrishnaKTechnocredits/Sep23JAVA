package technoCredits.accessModifiers;

class Manager {
	
	private int x = 10;
	int y = 20;
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	private void updateData() {
		x = 30;
		y = 50;
	}
	
	void processData() {
		//if , ip
		updateData();
		System.out.println(x+y);
	}
}
