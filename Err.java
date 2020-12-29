import java.util.Scanner;
class Err
{
public static void main(String args[])
{int a ,b;

	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	//b=in.nextInt();
	
	try 
	{
	if(a<18)
	{
	throw new Userc("invalid");
	}
	else
	{
		System.out.println("valid");
	}
	}
	catch(Exception e)
	{
	System.out.println("age is greater than 18");
	}
	}
}
	//outer.inner obj=new outer inner();
	//obj.
	
	
	class Userc extends Exception

	{
     
		Userc(String s)
		{
		System.out.println("invalid");
		
		}
	}