package pkg1;

public class Day5_PractiseSon extends Day5_PractiseFather{
	
	public void third()
	{
		
		System.out.println("Son");
	}
	public static void main(String[] args) 
	{
		
		Day5_PractiseSon obj=new Day5_PractiseSon();
		obj.third();
		obj.second();
		obj.first();
	}

}
