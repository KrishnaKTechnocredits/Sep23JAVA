package pavan;

class Example18{
	
	void printName(String name){
		for(int index=1;index<=5;index++){
		System.out.println(index+"-"+name);
		}
	}
	public static void main (String[]args){
		Example18 Example = new Example18();
		Example.printName("pavan");
	}
}