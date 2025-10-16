
public class constructor {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Komal",04);
	}
}

class Employee
{
	private String name;
	private int id;
	
	Employee(String name, int id)  //Parameterized Constructor
	{
		this.name = name;
		this.id = id;
		
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Id : " + id);
		System.out.println("");
	}
}

/*
 * Constructor : Constructor is same as method without return type,
 * In the Constructor class name & method name must same,
 * we can use constructor to create the object and also for initialize variables.*/
