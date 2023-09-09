package denish;

class Assignment8{

	void grade(int mark){
		if(mark>=90 && mark<=100){
			System.out.println("A+");
		}
		else if(mark>=80 && mark<90){
			System.out.println("A");
		}
		else if(mark>=70 && mark<80){
			System.out.println("B");
		}
		else if(mark<70 && mark>=0){
			System.out.println("Word Hard");
		}
		else if(mark<0 || mark>100){
			System.out.println("Invalid Score");
		}
	}
	
	public static void main(String[] args){
		Assignment8 assignment8 = new Assignment8();
		assignment8.grade(92);
		assignment8.grade(76);
		assignment8.grade(23);
		assignment8.grade(-19);
		assignment8.grade(102);
	}
}