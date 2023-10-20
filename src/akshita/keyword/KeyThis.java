package akshita.keyword;

public class KeyThis extends KeySuper{

	//int x=10;       					//If instance variable is not in child class and it is in parent class then we can use
										//	this keyword to access parent class as we extends class Parent variable is also available in child class indirectly
	
	static void m2() {
		int y=2;
		System.out.println("Current class Static method");
		//System.out.println(this.x);				can not call this keyword in static method	
	}
	
	void m3() {
		System.out.println("Current class non static methos");
	}
	void m1() {
		int x=5;
		System.out.println("Local Variable : " +x);                        //local variable can call directly
		System.out.println("instance variable : "+this.x);  			  //Instance variable can call using this keyword
		System.out.println("Parent variable : "+super.x); 				  //Parent class variable can call using super keyword
		//System.out.println(this.y);			                         	can not access static variable with this/Super keyword 
		System.out.println(this); 										 //give address of current object means method m1 object
		
		KeyThis.m2();								                     //should call static method with class name    	
		this.m3(); 														 //call current class method
		super.m1(); 													 //Parent class variable can call using super keyword
	}
	
	public static void main(String[] args) {
		KeyThis key= new KeyThis();
		key.m1();
		System.out.println(key);
	}

}
