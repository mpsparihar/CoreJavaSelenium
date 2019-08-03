package pkg1;

public class ClassA {
	int a; //variable 
	public void display () // method 
	{
		System.out.println("welcome to all of you");  //print 
	}
  
	 public static void main(String[] args) //main 
	 {
		 System.out.println("first line");
		ClassA mohit=new ClassA(); // object creation 
		mohit.display(); // call  method 
		mohit.a=34; /// call a variable 
		System.out.println(mohit.a); //print a variable 
		
	}
}
