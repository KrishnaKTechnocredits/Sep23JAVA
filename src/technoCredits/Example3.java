package technoCredits;
class Example3{
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
		Example3 example31 = new Example3();
		Example3 example32 = new Example3();
		
		example31.updateData();
		example32.display();
		example31.display();
	}
}