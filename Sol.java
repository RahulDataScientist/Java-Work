//. Write a program to demonstrate try-catch finally
//by Rahul Nyati


import java.util.Scanner;
public class Sol
{
public static void main(String args[])
{
int a;
int b;
int c;
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
try{
int d=a/(b-c);
System.out.println(+d);
}
catch(ArithmeticException e)
{
System.out.println("Artithmetic Exception you can not divide by zero");
}
finally
{
System.out.println("I am final in block");
}}}
/*

C:\Users\rahul\OneDrive\Documents\math>javac Use.java

C:\Users\rahul\OneDrive\Documents\math>java Use.java
Sum=9

C:\Users\rahul\OneDrive\Documents\math>javac Sol.java

C:\Users\rahul\OneDrive\Documents\math>java Sol.java
4
5
5
Artithmetic Exception you can not divide by zero
I am final in block
*/
/*
class Main {
   public static void main(String args[]) {
      int val1, val2;
      try {
         //this block will contain statements that may raise exceptions
         System.out.println("Try Block:: Start");
         val1 = 0;
         val2 = 25 / val1;
         System.out.println(val2);
         System.out.println("Try Block:: End");
      }
      catch (ArithmeticException e) { 
         //handler for ArithmeticException
         System.out.println("ArithmeticException :: Divide by Zero!!");
      }
      System.out.println("Outside try-catch:: Rest of the code.");
   }
}

*/