//Asignment 7
package yogesh;
class Number{
	
	void max(int num1,int num2){
	if(num1>num2)
		System.out.println(num1+"is bigger in between"+num1+" and "+num2);
	else
		System.out.println(num2+"is bigger in between"+num1+" and "+num2);
	}
		
	void min(int num1,int num2){
	if(num1<num2)
		System.out.println(num1+"is smaller in between"+num1+" and "+num2);
	else
		System.out.println(num2+"is smaller in between"+num1+" and "+num2);
	}
	
	public static void main(String[] args){
		Number number=new Number();
		number.max(10,17);
		number.min(10,17);
	}
}
