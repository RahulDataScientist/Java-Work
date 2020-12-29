//Write a program to write into a file

import java.io.*;
class Rtyf
{
public static void main(String args[]) throws Exception
{
FileOutputStream f=new FileOutputStream("a.txt");
String s="yguyguyguy";
byte b[]=s.getBytes();
f.write(b);
}

}