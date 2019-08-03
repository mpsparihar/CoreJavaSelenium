package pkg1;

public class Day1_Assignment {
	int age ;
	int roll_no ;
	public void display1()
	{
		System.out.println("first method");
	}
	
	public void display()
	{
		System.out.println("second method");
	}
	public static void main (String[] args)
	{
		Day1_Assignment mohit=new Day1_Assignment();
		mohit.display1();
		mohit.display();
		mohit.age=21;
		mohit.roll_no=44;
		System.out.println(mohit.age);
		System.out.println(mohit.roll_no);
		
		
	}
}
