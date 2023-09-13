package pavan;

//assi 8

class Assi8{

	void grade(int Score){
		if (Score>=90 && Score<=100)
			System.out.println("Your Grade is A+ ");
		
		else if(Score>=80 && Score<90)
			System.out.println("your Grade is A");
			
		else if (Score>=70 && Score<80)
			System.out.println("Your Grade is B ");
			
		else if(Score>=0 && Score<70)
			System.out.println("Work Hard");
			
		else
			System.out.println("Invalid Score");
		}
		
	public static void main (String[] args){
		Assi8 assi =new Assi8();
		assi.grade(92);
		assi.grade(76);
		assi.grade(23);
		assi.grade(102);
	}
}
	