
package naresh;

class StudentGrade{
	
	
	void grades(int score){
		if(score>=90 && score<=100){
			System.out.println("A+");
		}else if(score>=80 && score<90){
			System.out.println("A");			
        }else if(score>=70 && score<80){
			System.out.println("B");			
         }else if(score<=70 && score<=0){
			System.out.println("Work harder");
        }else if(score<0 || score>=100){
			System.out.println("Invalid score");			
		}
	}		
          

	public static void main(String[] args){
	
			StudentGrade studentDetail=new StudentGrade();
			studentDetail.grades(93);
			studentDetail.grades(83);
			studentDetail.grades(79);
			studentDetail.grades(-50);
			studentDetail.grades(123);

    }

}