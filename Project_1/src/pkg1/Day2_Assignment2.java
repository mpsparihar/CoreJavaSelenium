package pkg1;

public class Day2_Assignment2 {
	
	public int div(int a ,int b)
	{
	int c ;
	c=a/b;
	return c;
	}
	
	public int sum(int a , int b)
	{
		int c;
		c=a+b;
		return c ;
	}
	
	public int sub(int a , int b)
	{
		int c;
		c=a-b;
		return c;
	}
	
	public void mul(int a , int b)
	{
		int c;
		c=a*b;
		System.out.println("final result is"+c);
	}
	
	public static void main (String[] args)
	{
		Day2_Assignment2 obj=new Day2_Assignment2();
		int div_result = obj.div(10, 2);
		int sum_result = obj.sum(div_result, 2);
		int sub_result = obj.sub(sum_result, 3);
		obj.mul(sub_result,2);
	}
}
