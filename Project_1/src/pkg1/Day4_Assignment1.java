package pkg1;

public class Day4_Assignment1 {
	
	public Day4_Assignment1()
	{
		this(1,2);
		System.out.println("I am default method");
	}
	public Day4_Assignment1(int a )
	{
		this();
		System.out.println("I am 1 parameterized method");
	}
	public Day4_Assignment1(int a , int b)
	{
		System.out.println("I am 2 parameterized method");
	}
	public Day4_Assignment1(int a , int b, int c)
	{
		this(1);
		System.out.println("I am 3 parameterized method");
	}
	
	public static void main(String[] args) 
	{
		Day4_Assignment1 obj=new Day4_Assignment1(1,2,3);
	}

}
