package akshita.keyword;

public class KeySuper {

	int x = 20;

	void m1() {
		System.out.println("parent class instance variable from super class " + this.x);
	}
	
	/*super.m1();         parent of KeySuper is object class in which m1(); method is not declared. 
						   so can not call parent class method m1 as super.m1();*/
}



//Dynamic polymorphisum not affect this/super keyword.