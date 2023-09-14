package jagrati;

//Assignment 8  - Print student grade based on obtain score. *

class Printstudentgrade{
 
	void obtainScore(int score){
		if (score >= 90 && score <= 100){
			System.out.println("Student is score A+");
		}else if (score >= 80 && score <= 90){
			System.out.println("Student is score A");
		}else if (score >= 70 && score <= 80){
			System.out.println("Student is score B");	
		}else if (score <= 70 && score >0){
			System.out.println("Student needs to work hard in exam");
	    }else if (score < 0 || score > 100){
		System.out.println("Invalid score");
	    }
	}
	
	public static void main(String [] args){
		Printstudentgrade student = new Printstudentgrade();
		student.obtainScore(92);
		student.obtainScore(76);
		student.obtainScore(23);
		student.obtainScore(-19);
		student.obtainScore(102);
	}

}