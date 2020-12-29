import java.io.*;
class Readf
	{
	public static void main(String args[]) throws Exception
	{
	
	FileInputStream f=new FileInputStream("a.txt");
	System.out.println("File Content");
	int ch;
	while((ch=f.read())!=-1)
	System.out.print((char)ch);
	}
	}
	