package shrutika;

public class As37InheritanceCases {

	public static void main(String[] args) {
		// Case1 : Only parent file variables and methods called . 
		//because child class can't access child class new added methods and variables. 
		System.out.println("Case :1");
		As37InheritanceCollege inheritanceCollegeA37 =new As37InheritanceCollege();
		System.out.println(inheritanceCollegeA37.rollno);
		System.out.println(inheritanceCollegeA37.registerNo);
		//System.out.println(inheritanceCollegeA37.studentId); CE
		inheritanceCollegeA37.registeration();
		//inheritanceCollegeA37.marks(); //CE
		inheritanceCollegeA37.admission();
		
		
		//Case 2: Static polymorphism = Object is created for child class hence all the variables and methods are accessible from both the classes
		//If parent class and child class have same method and variable then it will take from child class.
		System.out.println("\n\nCase :2 Static polymorphism");
		As37InheritanceStudent inheritanceStudentA37 =new As37InheritanceStudent();
		System.out.println(inheritanceStudentA37.rollno);
		System.out.println(inheritanceStudentA37.registerNo);
		System.out.println(inheritanceStudentA37.studentId);
		inheritanceStudentA37.registeration();
		inheritanceStudentA37.marks(); 
		inheritanceStudentA37.admission();
		
		
		//Case 3:Dynamic polymorphism = Reference variable created parent class and child class object
		//Variable (Properties) do not change from compile time to run time and 
		//method (behavior) will change while compile the run time is Dynamic polymorphism.
		System.out.println("\n\nCase :3 Dynamic polymorphism");
		As37InheritanceCollege inheritanceCollege1A37 =new As37InheritanceStudent();
		System.out.println(inheritanceCollege1A37.rollno);
		System.out.println(inheritanceCollege1A37.registerNo);
		//System.out.println(inheritanceCollegeA37.studentId);
		inheritanceCollege1A37.registeration();
		//inheritanceCollegeA37.marks(); 
		inheritanceCollege1A37.admission();
		
		//Case 4: it is not possible we cannot create child reference with parent object. 
		System.out.println("\n\nCase :4 is not possible cannot create child reference with parent object.");
		//InheritanceStudentA37 InheritanceStudentA37 = new inheritanceCollege1A37();
		
		//Case 5 : Same as case 3 (Dynamic polymorphism)
		System.out.println("\n\nCase :5 . Same as case 3 (Dynamic polymorphism)");
		As37InheritanceCollege inheritanceCollege2A37 =new As37InheritanceCollege();
		As37InheritanceStudent inheritanceStudent2A37 =new As37InheritanceStudent();
		inheritanceCollege2A37 = inheritanceStudent2A37;
		System.out.println(inheritanceCollege2A37.rollno);
		System.out.println(inheritanceCollege2A37.registerNo);
		//System.out.println(inheritanceCollege2A37.studentId); CE
		inheritanceCollege2A37.registeration();
		//inheritanceCollege2A37.marks(); CE
		inheritanceCollege2A37.admission();
		
		//Case 6: Same as case 2 (parent class object will not be store in child class hence need typecasting complier will allow 
		//but JVM will through exception error.
		System.out.println("\n\nCase :6");
		As37InheritanceCollege inheritanceCollege3A37 =new As37InheritanceStudent();
		As37InheritanceStudent inheritanceStudent3A37 =new As37InheritanceStudent();
		inheritanceStudent3A37 = (As37InheritanceStudent)inheritanceCollege3A37;
		System.out.println(inheritanceStudent3A37.rollno);
		System.out.println(inheritanceStudent3A37.registerNo);
		System.out.println(inheritanceStudent3A37.studentId); 
		inheritanceStudent3A37.registeration();
		inheritanceStudent3A37.marks(); 
		inheritanceStudent3A37.admission();
		}	
}
