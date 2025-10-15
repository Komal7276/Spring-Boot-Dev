
public class Overloading {
	public static void main(String[] args) {
	
		Student s1 = new Student(1992167354);
		
		Student s2 = new Student("Komal", 21);
		
		Student s3 = new Student("Komal",'c',88.20);
	}
}

class Student
{
	private String name;
	private char division;
	private int age;
	private long no;
	private double percentage;
	
	public Student(long no)
	{
		this.no = no;
		
		System.out.println("Mob No : " + no);
		System.out.println("");
	}
	
	public Student(String name,int age)
	{
		this.name = name;
		this.age = age;
		
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("");
	}
	
	public Student(String name,char division, double percentage)
	{
		this.name = name;
		this.division = division;
		this.percentage = percentage;
		
		System.out.println("Name : " + name);
		System.out.println("Division : " + division);
		System.out.println("Percentage : " + percentage);
	}
}
