import java.io.*;
class Jhhh
	{
	public static void main(String args[])
	{
	try
	{
	FileInputStream f=new FileInputStream("a.txt");
	BufferedInputStream buff=new BufferedInputStream(f);
	int c=buff.read();
	while(c!=-1)
	{
		
		System.out.println((char)c);
		c=buff.read();
	//if(c==13)
	//{
		//System.out.println("next line");
		//System.out.println((char)c);
		
		
	//	c=buff.read();
	//}
		
		
	}

	}

catch(Exception e)
{
	System.out.println("IO eXception");
}

}
}