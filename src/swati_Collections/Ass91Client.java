/*Assignment-91 : 10th Nov'2023
WAP to sort Employee based on different attributes.
Employee class attributes : empName, empid, deptId, deptName, salary, yearsOfExp
Sorting can be applicable on salary, yearsOfExp, empName
Hint : use Comparator interface. */

package swati_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ass91Client {

	public static void main(String[] args) {
		Ass91Employee employee1 = new Ass91Employee("Swati", 45, "HR", 15, 9);
		Ass91Employee employee2 = new Ass91Employee("Shrutika", 98, "SAP", 6, 19);
		Ass91Employee employee3 = new Ass91Employee("Sonal", 5, "IT", 9, 15);
		Ass91Employee employee4 = new Ass91Employee("kajol",3 , "SE", 20, 4);
		
		List<Ass91Employee> listOfEmployee = new ArrayList<Ass91Employee>();
		listOfEmployee.add(employee1);
		listOfEmployee.add(employee2);
		listOfEmployee.add(employee3);
		listOfEmployee.add(employee4);
		System.out.println("Employee Data:");
		System.out.println("list Of Employee");
		System.out.println("***************************************************");
		System.out.println("Employees are sorted based on Name:");
		Collections.sort(listOfEmployee, new Ass91NameComp());
		System.out.println(listOfEmployee);
		
		System.out.println("***************************************************");
		
		Set<Ass91Employee> setOfEmployee = new TreeSet<Ass91Employee>(new Ass91SalaryComp());
		setOfEmployee.add(employee1);
		setOfEmployee.add(employee2);
		setOfEmployee.add(employee3);
		setOfEmployee.add(employee4);
		System.out.println("Employees are sorted based on Salary:");
		System.out.println(setOfEmployee);
		
		System.out.println("***************************************************");
		
		Set<Ass91Employee> setOfEmployee1 = new TreeSet<Ass91Employee>(new Ass91yearsOfExpComp());
		setOfEmployee1.add(employee1);
		setOfEmployee1.add(employee2);
		setOfEmployee1.add(employee3);
		setOfEmployee1.add(employee4);
		System.out.println("Employees are sorted based on YearsOfExp:");
		System.out.println(setOfEmployee1);
	}
}
