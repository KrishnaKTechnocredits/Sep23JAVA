package sumeet;

class Assignment8{
	
	void studentMarks(int marks){
		if(marks<0 || marks>100){
			System.out.println("Invalid Score");
		}else if(90<=marks && marks<=100){
			System.out.println("A+");
		}else if(80<=marks && marks<90){
			System.out.println("A");
		}else if(70<=marks && marks<80){
			System.out.println("B");
		}else if(0<=marks && marks<70){
			System.out.println("Work Harder");
		}
	}
	
	public static void main(String[] args){
		Assignment8 grade=new Assignment8();
		grade.studentMarks(92);
		grade.studentMarks(76);
		grade.studentMarks(23);
		grade.studentMarks(80);
		grade.studentMarks(102);
	}
}