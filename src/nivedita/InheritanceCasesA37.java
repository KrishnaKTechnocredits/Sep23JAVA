package nivedita;

public class InheritanceCasesA37 {

	public static void main(String[] args) {
		// Case1 : Only parent file variables and methods called . 
		//because child class can't access child class new added methods and variables. 
		System.out.println("Case :1");
		InheritanceCollegeA37 inheritanceCollegeA37 =new InheritanceCollegeA37();
		System.out.println(inheritanceCollegeA37.rollno);
		System.out.println(inheritanceCollegeA37.registerNo);
		//System.out.println(inheritanceCollegeA37.studentId); CE
		inheritanceCollegeA37.registeration();
		//inheritanceCollegeA37.marks(); //CE
		inheritanceCollegeA37.admission();


		//Case 2: Static polymorphism = Object is created for child class hence all the variables and methods are accessible from both the classes
		//If parent class and child class have same method and variable then it will take from child class.
		System.out.println("\n\nCase :2 Static polymorphism");
		InheritanceStudentA37 inheritanceStudentA37 =new InheritanceStudentA37();
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
		InheritanceCollegeA37 inheritanceCollege1A37 =new InheritanceStudentA37();
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
		InheritanceCollegeA37 inheritanceCollege2A37 =new InheritanceCollegeA37();
		InheritanceStudentA37 inheritanceStudent2A37 =new InheritanceStudentA37();
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
		InheritanceCollegeA37 inheritanceCollege3A37 =new InheritanceStudentA37();
		InheritanceStudentA37 inheritanceStudent3A37 =new InheritanceStudentA37();
		inheritanceStudent3A37 = (InheritanceStudentA37)inheritanceCollege3A37;
		System.out.println(inheritanceStudent3A37.rollno);
		System.out.println(inheritanceStudent3A37.registerNo);
		System.out.println(inheritanceStudent3A37.studentId); 
		inheritanceStudent3A37.registeration();
		inheritanceStudent3A37.marks(); 
		inheritanceStudent3A37.admission();
		}	
}