 package naresh;

  public class Assignment44 {
	  
	  
	  void m1(String[] arr) {  
		  for (int i = 0; i < arr.length; i++) {
			  String str = arr[i];
			  
			  
			  for(int index =0;index<str.length();index++) {
			  char ch = str.charAt(index);
          if (Character.isDigit(ch)) {
              String str2 = arr[i].toUpperCase();
              System.out.println(str2);
              break;
          }
          }
			 
      }
	  }
	   
	  public static void main(String[] args) {
	          String[] input = new String[4];
	          input[0] = "Rah2u4l";
	          input[1] = "Technocredits";
	          input[2] = "J6a6y";
	          input[3] = "cred5it2s";
	          Assignment44 a = new Assignment44();
	          a.m1(input);
	     

	        
	 

	  
	      }
	  }
  
  
/*  void m2(String[] a) {
 * 
 * 
 * }
 * 
 * 
 * 
 * void m1(String[] a) { int j =0; String temp = a[j];
 * 
 * String update; for (int i = 0; i < a.length; i++) {
 * 
 * for (int index = 0; index < temp.length(); index++) { char ch =
 * temp.charAt(index); if (Character.isDigit(ch)) { update = temp.toUpperCase();
 * 
 * System.out.println(update);
 * 
 * }
 * 
 * }
 * 
 * 
 * }
 * 
 * }
 * 
 * public static void main(String[] args) { String[] input = { "Rah2u4l",
 * "Technocredits", "J6a6y", "cred5it2s" };
 * 
 * Assignment44 a = new Assignment44(); a.m1(input);
 * 
 * }
 * 
 * }
 */