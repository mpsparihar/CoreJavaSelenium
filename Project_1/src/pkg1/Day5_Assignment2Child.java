package pkg1;

public class Day5_Assignment2Child extends Day5_Assignment2Parent {
	
	public Day5_Assignment2Child()
	{
		this(1,2);
		System.out.println("Child default constructor");
	}
	public Day5_Assignment2Child(int a)
	{
		this(1,2,3);
		System.out.println("Child 1 parameter constructor");
	}

	public Day5_Assignment2Child(int a , int b)
	{
		super(1);
		System.out.println("Child 2 parameter ");
	}
	
	public Day5_Assignment2Child(int a , int b , int c)
	{
		this();
		System.out.println("Child 3 parameter constructor");
	}

	public static void main(String[] args)
	{
		Day5_Assignment2Child obj=new Day5_Assignment2Child(1);
	}

}
