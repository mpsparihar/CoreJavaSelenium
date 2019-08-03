package pkg1;

import java.util.Scanner;

public class Day4_Assignment2 {
	
	public int sum(int a , int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int a , int b)
	{
		int c ;
		c=a-b;
		return c;
	}
	public int sum1(int a , int b)
	{
		int c ;
		c=a+b;
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
	
	public static void main(String[] args) 
	{
		Day4_Assignment2 obj=new Day4_Assignment2();
	Scanner s=new Scanner(System.in);
	System.out.println("enter the values for v1 & v2");
	int v1=s.nextInt();
	int v2=s.nextInt();
	int sum_result = obj.sum(v1,v2);
	System.out.println("print value (V1+V2)"+sum_result);
	System.out.println("enter the values for sum_result & v3");
	int sum_result1=s.nextInt();
	int v3=s.nextInt();
	int sub_result = obj.sub(sum_result,v3);
	System.out.println("print value ((v1+v2)-v3)"+sub_result);
	int sub_result1=s.nextInt();
	int v4=s.nextInt();
	int sum1_result = obj.sum1(sub_result,v4);
	System.out.println("print value (((v1+v2)-v3)+v4)"+sum1_result);
	int sum1_result1=s.nextInt();
	int v5=s.nextInt();
	int mul_result = obj.mul(sum1_result,v5);
	System.out.println("print value((((v1+v2)-v3)+v4)*v5)"+mul_result);
	int mul_result1=s.nextInt();
	int v6=s.nextInt();
    obj.div(mul_result,v6);
	System.out.println("final printed value for expression (((((v1+v2)-v3)+v4)*v5)/v6)");

	}

}
