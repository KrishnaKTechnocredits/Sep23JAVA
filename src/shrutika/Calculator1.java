package shrutika;
class Calculator1 {
     int answer;
  
    void add(int num1, int num2){
		int answer=num1+num2;
		System.out.println("Addition is" +answer);
	}
    void sub(int num1, int num2){
		int answer=num1-num2;
		System.out.println("Subtraction=" +answer);
	}
	void div(int num1, int num2){
		int answer=num1/num2;
	    System.out.println("Devison=" +answer);
	}
	void mul(int num1, int num2){
		int answer=num1*num2;
		System.out.println("Multiplication=" +answer);
	}
		
    public static void main(String[] args) {
		 Calculator1 calculator = new Calculator1();
		 calculator.add(10,12);
		 calculator.sub(25,10);
		 calculator.div(15,5);
		 calculator.mul(34,9);
   }
}
