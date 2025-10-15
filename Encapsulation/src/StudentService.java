
public class StudentService {

	public static void main(String[] args) {
			
			Student S1= new Student();
			
			S1.setName("Komal");
			S1.setRollNo(22);
			S1.setMarks(88);
			
			System.out.println("Name : " + S1.getName());
			System.out.println("Roll NO : " + S1.getRollNo());
			System.out.println("Marks : " + S1.getMarks());
			
	}
}


class Student
{
	private String name;
	private int rollNo;
	private int marks;
	
	String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;	
	}
	
	int getRollNo()
	{
		return rollNo;
	}
	
	public void setRollNo(int rollNo)
	{
		this.rollNo= rollNo;
	}
	
	int getMarks()
	{
		return marks;
	}
	
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
}