package vijay;

class Example14b{

	void printStudentGrade(int marks){
		if(marks<0 || marks>100){
			System.out.println("Invalid Score");
		}else if(marks>90 && marks<=100){
			System.out.println("A+");
		}else if (marks>80 && marks<=90){
			System.out.println("A");
		}else {
			System.out.println("You need to work hard");
		}
	}
	
	public static void main (String[] args){
		Example14b example14b = new Example14b();
		example14b.printStudentGrade(82);
	}
}

// above you can see example of "if else ladder".
// it is not mandatory to write else block in if else ladder.
// you cannot write conditional statement in alone else block. you can write conditional statement in else if only
// in if else ladder if the condition matches then it doesn't go for next, so it reduces time complexity,
// but if you write if if block or multiple if block if condition matches then also it goes to all statements, so it increases time complexity
// if there are two matching blocks in if else ladder, then it will execute first block only.