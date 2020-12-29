class Arro
	{
	public static void main(String args[])
	{
	mythread1 t1=new mythread1();
	mythread2 t2=new mythread2();
	t1.start();
	t2.start();
	}
	}
class mythread1 extends Thread
{
	public void run()
	{
	for(int i=0;i<10;i++)
	{
	System.out.println("******");

	}
}
}
class mythread2 extends Thread
{
public void run()
	{
	for(int i=0;i<10;i++)
	{
	System.out.println("\t\n*");
	}System.out.println("\t");
}	
}