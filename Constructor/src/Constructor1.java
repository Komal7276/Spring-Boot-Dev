
public class Constructor1 {

	public static void main(String[] args) {
		
		Student1 s1 = new Student1("Komal");
		//Student1 s2 = new Student1("Komal", 1);
		Student1 s3 = new Student1("Komal",12,88);
	}
}

class Student1 
{
	private String sName;
	private int sRollno;
	private int sMarks;
	
	Student1(String name)
	{
		this.sName = name;
		
		System.out.println("Name : " + name);
		System.out.println("");
	}
	
	Student1(String name, int rollNo)
	{
		this.sName = name;
		this.sRollno = rollNo;
		
		System.out.println("Name : " + name);
		System.out.println("RollNo : " + rollNo);
		System.out.println("");
	}
	
	Student1(String name , int rollNo, int marks)
	{
		this.sName = name;
		this.sRollno = rollNo;
		this.sMarks = marks;
		
		System.out.println("Name : " + name);
		System.out.println("RollNo : " + rollNo);
		System.out.println("Marks : " + marks);
	}
	
}
