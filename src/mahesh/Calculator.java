/*Assignment 1 - Write Program for calculator which performed operations on instance variables*/

package mahesh;

class Calculator{
		int num1=4;// instance variable
		int num2= 2; // instance variable
		
		void add(){
			int answerSum=num1+num2;
			System.out.println("Addition" +answerSum);
		}
		
		void sub(){
			int answerSub=num1-num2;
			System.out.println("Subtraction=" +answerSub);
		}
		
		void mul(){
			int answermul=num1*num2;
			System.out.println("Subtraction=" +answermul);
		}
		
		void div(){
			int answerdiv=num1/num2;
			System.out.println("Subtraction=" +answerdiv);
		}
				
		public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}
