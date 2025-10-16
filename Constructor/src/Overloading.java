public class Overloading {
	
	public static void main(String[] args) {
		
		Student S =new Student("Komal");
		
		//Student  S1=new Student("Komal",12,'C',88.2);
		//Student S2=new Student("Komal",12);
		//Student S3=new Student("Komal",12,'C');
		
		Student S4=new Student("Komal",12,'C',88,727622345);
	}
}


class Student
{
	private String name;
	private int rollNo;
	private char div;
	private float percentage;
	private long mobNo;
	
	Student(String name)
	{
		this.name = name;
		
		System.out.println("Name : " + name);
		System.out.println("");
	}
	
	Student(String name , int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
		
		System.out.println("Name : " + name);
		System.out.println("Roll No :" + rollNo);
		System.out.println("");
	}
	
	Student(String name , int rollNo, char div)
	{
		System.out.println("Name : " + name);
		System.out.println("Roll No :" + rollNo);
		System.out.println("Divison :" + div);
		System.out.println("");
	}
	
	Student(String name , int rollNo, char div, float persentage)
	{
		System.out.println("Name : " + name);
		System.out.println("Roll No :" + rollNo);
		System.out.println("Divison :" + div);
		System.out.println("Percentage: " + percentage);
		System.out.println("");
	}
	
	Student(String name ,int rollNo,char div,float percentage,long mobNO)
	{
		System.out.println("Name : " + name);
		System.out.println("Roll No :" + rollNo);
		System.out.println("Divison :" + div);
		System.out.println("Percentage: " + percentage);
		System.out.println("Mobile No :" + mobNO);
		System.out.println("");
	}
	
}



/*Constructor Overloading :
 * Multiple constructor in same class ,
 * but with different number of arguments called Constructor overloading 
 */
