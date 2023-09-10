package shrutika;
class Calculator2 {
   int total;
   
    void add(int num1, int num2){
		int answer = num1+num2;
		System.out.println("Addition is=" +answer);
		total = total+answer;
	}
    void sub(int num1, int num2){
		int answer=num1-num2;
		System.out.println("Subtraction=" +answer);
		total = total+answer;
	}
	void div(int num1, int num2){
		int answer=num1/num2;
		System.out.println("Devison=" +answer);
		total = total+answer;
	}
	void mul(int num1, int num2){
		int answer=num1*num2;
		System.out.println("Multiplication=" +answer);
		total = total+answer;
	}
	
	void display(){
		System.out.println("Total is=" +total);
	}
	
    public static void main(String[] args) {
		 Calculator2 calculator = new Calculator2();
		 calculator.add(10,12);
		 calculator.sub(25,10);
		 calculator.div(15,5);
		 calculator.mul(34,9);
		 calculator.display();
	 }
}
