package technoCredits.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ClientStudent {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Techno", "Pune", 82.2, 'B');
		Student s2 = new Student(22, "Credits", "Surat", 92.2, 'A');
		Student s3 = new Student(3, "Harsh", "Rajkot", 62.2, 'D');
		Student s4 = new Student(7, "Maulik", "Nagpur", 72.2, 'C');
		Student s5 = new Student(1, "Techno", "Pune", 82.2, 'B');

		HashSet<Student> setOfStudent = new HashSet<Student>();// I - > C
		setOfStudent.add(s1);
		setOfStudent.add(s2);
		setOfStudent.add(s3);
		setOfStudent.add(s4);
		setOfStudent.add(s5);

		System.out.println(setOfStudent.size());
		
		System.out.println(s1.hashCode());
		System.out.println(s5.hashCode());
		
		String str = "Hi";
		
		/*
		 * HashMap<Student, Object> hm = new HashMap<Student, Object>; hm.put(s1, null);
		 * hm.put(s2, null); hm.put(s3, null);
		 * 
		 * Set<Student> stdTemp = hm.keySet();
		 */
		
		
	}
}
