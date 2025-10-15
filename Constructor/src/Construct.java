
public class Construct {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Komal",21);
			
	}
			
}

class Employee
{
	private String empName = "Komal";
	private int empAge = 21;
	
	public Employee(String name,int age)
	{
		this.empName = name;
		this.empAge = age;
		
		System.out.println("Emp. Name : " + name);
		System.out.println("Emp. Age : " + age);
	}
}

/*
 * Constructor is same like method but it doesn't have return type.
 *class name and method name must be same.
 * Constructor is used to create a object and also used to initialize the variables.
 * */