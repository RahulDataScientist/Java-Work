class Arr
	{
		public static void main(String args[])
		{
			mythread1 t1=new mythread1();
			mythread2 t2=new mythread2();
			t1.start();
			t2.setPriority(7);
			t2.start();
		}
	}
class mythread1 extends Thread
{
	public void run()
		{
		for(int i=0;i<20;i++)
		{
		System.out.println("\n******");
			try
					{
					sleep(800);
					System.out.print("sleep");
					}
					catch(InterruptedException e)
						{		
		
						}	
		}	System.out.println("\n");
		}
}
class mythread2 extends Thread
{
public void run()
	{
		for(int i=0;i<20;i++)
			{
				System.out.println("\t\n*");
			}
		System.out.println("\t");
	}	
}