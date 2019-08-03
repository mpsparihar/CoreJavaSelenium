package pkg1;

public class Day3_Assignment 
{
 public  Day3_Assignment()
 { 
	 this( 1 , 2 , 3 , 4 );
	 System.out.println("Default constructor");
 }
 public Day3_Assignment(int a)
 {
	 this( );
	 System.out.println("one parameterized");
 }
 public Day3_Assignment(int a , int b )
 {
	 this( 1, 2, 3 );
	 System.out.println("two parameterized");
 }
 public Day3_Assignment(int a , int b , int c )
 { 
	 this( 1 );
	 System.out.println("three parameterized");
 }
 public Day3_Assignment(int a , int b , int c , int d )
 {    
	 System.out.println("four parameterized");
 }
 
 public static void main (String[] args)
 {
	 Day3_Assignment obj=new Day3_Assignment(1 ,2);
 }
 
}
