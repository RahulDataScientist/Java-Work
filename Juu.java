import java.io.*;
class Juu
	{
	public static void main(String args[]) throws Exception
	{
	try{
	FileOutputStream f=new FileOutputStream("a.txt");
	BufferedOutputStream buff=new BufferedOutputStream(f);
	
	char ch='a';
	f.write(ch);
	

	}

catch(Exception e)
{
	System.out.println("IO eXception");
}

}
}