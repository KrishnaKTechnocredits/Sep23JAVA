package technoCredits;
class Example4{
	String name = "Maulik";
	int rno = 1;
	
	void updateData(){
		name = "Harsh";
		rno = rno+1;
	}
	
	void display(){
		System.out.println(rno + "-" + name);
	}
	
	public static void main(String[] args){
		Example4 example41 = new Example4();
		example41.updateData();
		example41.display();
		
		Example4 example42 = new Example4();
		example42.display();
	}
}