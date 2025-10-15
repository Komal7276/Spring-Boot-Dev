
public class Test {

public static void main(String[] args) {
		
		Parent P1=new Parent();
		
		P1.child("Komal");

		P1.child(21);
		
		P1.child('B');
		
	}
}

class Parent
{	
	void child(String name)
	{
		System.out.println("Name :"+name);
	}
	
	void child(int age)
	{
		System.out.println("Age :"+age);
	}
	
	void child(char bGroup)
	{
		System.out.println("Blood Group :"+bGroup);
	}
}


/*IN Method Overloading method name must be same,  
 *input argument compulsory Different,
 *Return type and access modifier can be anything 
 **/



/*
 * Automatic Promotion
 * BSNLFD
 * B==>Byte
 * S==>Short
 * N==>Int
 * L==>Long
 * F==>Float
 * D-->Double */
