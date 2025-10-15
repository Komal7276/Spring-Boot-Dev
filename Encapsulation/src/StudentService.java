
public class StudentService {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setName("Komal");
		s.setRollNo(12);
		s.setMarks(88);
		
		System.out.println("Name :"+s.getName());
		System.out.println("RollNo :"+s.getRollNo());
		System.out.println("Marks :"+s.getMarks());
	}
}

class Student
{
	String name;
	int rollNo;
	int marks;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	
	public int getMarks()
	{
		return marks;
	}
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
}
