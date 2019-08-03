package pkg1;

public class Day5_Assignment1Child extends Day5_Assignment1Parent {
	
	public Day5_Assignment1Child()
	{
		this(1);
		System.out.println("Child default");
	}
	public Day5_Assignment1Child(int a)
	{
		super(1);
		System.out.println("Child 1 parameter");
	}

	public Day5_Assignment1Child(int a , int b)
	{
		this();
		System.out.println("Child 2 parameter");
	}

	public static void main(String[] args)
	{
		Day5_Assignment1Child obj=new Day5_Assignment1Child(1,2);
	}
}
