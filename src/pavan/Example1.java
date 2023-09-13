package pavan;

class Example1{
		int num;
		
		void processData(){
		num=10;
		}
		
		void display(){
			System.out.println("Number is "+num);
			}
		
public static void main (String[]args){
Example1 example1 = new Example1();
  example1.display();
  }
  }