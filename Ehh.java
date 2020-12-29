import java.io.*;
import java.util.Scanner;
class Ehh
{
public static void main(String args[]) throws Exception
{
String c;
String s;
Scanner in=new Scanner(System.in);
c=in.nextLine();
s=in.nextLine();
FileOutputStream f=new FileOutputStream(c);
byte b[]=s.getBytes();
f.write(b);
}
}