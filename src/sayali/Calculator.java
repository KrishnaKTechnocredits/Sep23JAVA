package sayali;

class Calculator{
    int num1=10;
    int num2=2;

    void add(){
        int  answer= num1+num2;
        System.out.println("Addition of numbers=" + answer);
    }

    void sub(){
        int answer= num1-num2;
        System.out.println("Subtraction of numbers=" + answer);
    }
	   
	void Multiply(){
        int answer= num1 * num2;
        System.out.println("Multiplication of numbers=" + answer);
    }
	  
	void Division(){
        int answer= num1/num2;
        System.out.println("Divisionion of numbers=" + answer);
    }	

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.add();
        calculator.sub();
	    calculator.Multiply();
	    calculator.Division();
		
	}
}	