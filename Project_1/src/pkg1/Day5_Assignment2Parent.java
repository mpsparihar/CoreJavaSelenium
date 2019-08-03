package pkg1;

public class Day5_Assignment2Parent {
	
	public Day5_Assignment2Parent()
	{
		this(1,2,3);
		System.out.println("Parent default");
	}
	public Day5_Assignment2Parent(int a)
	{
		this(1,2);
		System.out.println("Parent 1 parameter");
	}

	public Day5_Assignment2Parent(int a , int b)
	{
		this();
		System.out.println("Parent 2 parameter");
	}

	public Day5_Assignment2Parent(int a , int b , int c)
	{
		System.out.println("Parent 3 parameter");
	}

}
