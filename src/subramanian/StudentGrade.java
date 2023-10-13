package subramanian;
class StudentGrade{
	
	void score(int score){
		if(score>90 && score<=100){
		System.out.println("Score is between 90 and 100. Grade = A+ ");
		}
		
		else if(score>80 && score<=90){
		System.out.println("Score is between 80 and 90. Grade = A ");
		}
		
		else if(score>70 && score<=80){
		System.out.println("Score is between 70 and 80. Grade = B ");
		}
		
		else if(score<70 && score>=0){
		System.out.println("Work Hard Score is Less ");
		}
		
		else{
		System.out.println("Invalid Score ");
		}
	}
		
	public static void main(String[] args){
		StudentGrade studentGrade = new StudentGrade();
		studentGrade.score(95);
		studentGrade.score(90);
		studentGrade.score(85);
		studentGrade.score(78);
		studentGrade.score(45);
		studentGrade.score(-100);
		studentGrade.score(120);
		}
	}	