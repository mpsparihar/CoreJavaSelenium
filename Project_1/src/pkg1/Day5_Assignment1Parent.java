package pkg1;

public class Day5_Assignment1Parent {
	
	public Day5_Assignment1Parent()
	{
		this(1,2);
		System.out.println("Parent default");
	}
	public Day5_Assignment1Parent(int a)
	{
		this();
		System.out.println("Parent 1 parameter");
	}

	public Day5_Assignment1Parent(int a , int b)
	{
		System.out.println("Parent 2 parameter");
	}
}
