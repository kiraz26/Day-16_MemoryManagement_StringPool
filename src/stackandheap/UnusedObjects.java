package stackandheap;

import java.util.Scanner;

public class UnusedObjects {

	static Scanner input = new Scanner(System.in);

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		emp1.salary = 3456;

		Employee emp2 = new Employee();
		emp2.salary = 6000;

		System.out.println("Emp1 salary: " + emp1.salary);
		System.out.println("Emp2 salary: " + emp2.salary);

		emp1 = emp2;
		System.out.println("Emp1 salary: " + emp1.salary);
		System.out.println("Emp2 salary: " + emp2.salary);
		// =======================================================================
		// emp1 will not refer to any object in HEAP
		emp1 = null;
		// System.out.println("Emp1 salary: " + emp1.salary);

		Employee e1 = new Employee();
		e1.salary = 1000;
		Employee e2 = new Employee();
		e2.salary = 5000;

		Employee e3 = new Employee();
		e3.salary = 3333;
		e3 = e1; //Employee with 3333 is ready for GC
		e1 = e2; //e1 is pointing to Employee with 5000
		e2 = e3; //Employee with 5000 ready for GC

		System.out.println("How many objects ready for GC?");
		System.out.println(e1.salary);
		System.out.println(e2.salary);
		System.out.println(e3.salary);

		int i = input.nextInt();
		System.out.println(i);
		
		
		
		
		
	}

}
