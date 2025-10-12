
public class Company {

	public static void main(String[] args) {
		
		Manager m = new Manager();
		
		m.name="Komal";
		m.age=20;
		m.empId=1010;
		m.salary=250000;
		m.department="IT";
		
		System.out.println("Name : "+ m.name);
		System.out.println("Age : "+ m.age);
		System.out.println("Emp Id : "+ m.empId);
		System.out.println("Salary : "+ m.salary);
		System.out.println("Department : "+ m.department);
				
	}
}

class Person
{
	String name;
	int age;
}

class Employee extends Person
{
	int empId;
	double salary;
}

class Manager extends Employee
{
	String department;
	
}