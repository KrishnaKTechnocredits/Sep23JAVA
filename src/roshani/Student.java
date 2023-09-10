 //class- predefined name
 //Student,display- User defined keyword
 //name,rno-Variable
 //; - termination operator
 //String -Data Type(Total 8 Data Types are there in Java)
 //Functionas and methods are same
 
 //classname-snake casing
 //variables-camel casing
 //body-consist of class and method
 //display-method name
 //()- parameters or arguments
 //{} - method ki body
 //method-name,parameters,return type,body
 //String-parameters
 //args-variable name can be anythoing, a or args
//new - keyword
//s,student -variable name follows camel case 
package roshani;

 class Student{                  
	String name="Roshni";
	int rno=15;
	
	void display(){     //void(keyword) return type
		System.out.println(name);
		System.out.println(rno);
	}
	
	public static void main(String[] args){
			Student s = new Student();  ///object
			s.display();
	}
 }