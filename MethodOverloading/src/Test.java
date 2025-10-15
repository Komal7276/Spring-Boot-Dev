
public class Test {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		
		p1.child(20);
		//p1.child("Komal");
	}
}

class Parent
{
	void child(int age)
	{
		System.out.println("Age : " + age);
	}
	
	void child(String name)
	{
		System.out.println("Name : " + name);
	}
	
	void child(long number)
	{
		System.out.println("Number : " + number);
	}
}


/*
 * In Method Overloading method name must be same ,
 * input arguments compulsory different ,
 * return type and access modifier can be anything
 * 
 * 
 * 
 * Automatic Promotion : BSNLFD
 * B - Byte / Char
 * S - Short
 * N - Int
 * L - Long
 * F - Float
 * D - Double
 * 
 * 
 */
