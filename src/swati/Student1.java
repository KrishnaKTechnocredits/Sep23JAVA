package swati;

//ASSIGNMENT 8
class Student1{
	
	void rank(int score){
		if(score>=90 && score<=100){
			System.out.println(score +" is your total score,Hence you have achieved A+ grade");
		}else if(score>=80 && score<90){
			System.out.println(score +" is your total score,Hence you have achieved A grade");
		}else if(score>=70 && score<80){
			System.out.println(score +" is your total score,Hence you have achieved B grade");
		}else if (score<70 && score>=0){
			System.out.println(score +" is your total score,Work harder");	
		}else{
			System.out.println(score +" Is Invalid score");	
		}
	}
	
	public static void main(String[] args){
		Student1 Student1 = new Student1();
		Student1.rank(92);
		Student1.rank(76);
		Student1.rank(23);
		Student1.rank(-19);
		Student1.rank(102);
	}
}
