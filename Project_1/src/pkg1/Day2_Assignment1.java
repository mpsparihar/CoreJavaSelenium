package pkg1;

public class Day2_Assignment1 {
	
	public int sum(int a , int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sum1(int a , int b)
	{
		int c ;
		c=a+b;
		return c;
	}
	public int sub(int a , int b)
	{
		int c ;
		c=a-b;
		return c;
	}
	public int mul(int a , int b)
	{
		int c ;
		c=a*b;
		return c;
	}
	public void div(int a , int b)
	{
		int c;
		c=a/b;
		System.out.println("final result is"+c);
	}
	public static void main (String[] args)
	{
		Day2_Assignment1 obj=new Day2_Assignment1();
	    int sum_result= obj.sum(10, 2);
	    int sum1_result= obj.sum1(sum_result, 2);
	    int sub_result= obj.sub(sum1_result, 2);
	    int mul_result= obj.mul(sub_result, 2);
	    obj.div(mul_result, 2);
	}

}
