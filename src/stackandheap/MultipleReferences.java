package stackandheap;


public class MultipleReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create new Employee object in HEAP and let emp1 point to it
		Employee emp1 = new Employee();
		//set salary value of Employee object to 2000
		emp1.salary = 2000;
		//Create Employee emp2 reference variable in Stack and
		//pint to same object that em1 is pointing to.
		Employee emp2 = emp1;
		//because both references are looking at same exact object 
		//value of salary will be same too
		System.out.println("Emp1 salary: "+emp1.salary);
		System.out.println("Emp2 salary: "+emp2.salary);

		emp2.salary=5000;
		
		System.out.println("Emp1 salary: "+emp1.salary);
		System.out.println("Emp2 salary: "+emp2.salary);

		Employee emp3=emp2;
		System.out.println("Emp3 salary: "+emp3.salary);

		
	}

}
