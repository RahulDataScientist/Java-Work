//Exceptions in java 
//by Rahul Nyati
class Zax
{
public static void main(String args[])
	{
		Vote xyz=new Vote();
		xyz.check(12);
	}
}
class Vote 
{
	void check(int age)
	{
	if(age<18)
	{
		throw new ArithmeticException("invlid age");
	}	
	else
	{
		System.out.println("dghgghh");
	}
	
}}