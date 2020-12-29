 //Write a program which has four methods – add(), subtract(), multiply() and divide() and demonstrate a simple console calculator.
//. Write a program to demonstrate the working of methods.
//By Rahul Nyati

import java.util.Scanner;
public class Calc
{
public static void main(String []args)
{
int i;
System.out.println("Enter number\n 1 for Addition\n2 for Subtraction\n3 for multiplication and \n4 for Division");
Scanner in=new Scanner(System.in);
Oper obj=new Oper();
i=in.nextInt();
System.out.println("Enter the first No=");
obj.x=in.nextInt();
System.out.println("Enter the Second No=");
obj.y=in.nextInt();
switch(i)
{
case 1:
obj.add();
break;
case 2:
obj.sub();
break;
case 3:
obj.multi();
break;
case 4:
obj.div();
break;
default:
System.out.println("Invalid Entry");
}
}
}
class Oper
{
int x,y;
void add()//method
{
System.out.println("Sum="+(x+y));
}
void sub()//method
{
System.out.println("Subtraction="+(x-y));
}
void multi()//method
{
System.out.println("Multiplication="+(x*y));
}
void div()//method
{
System.out.println("Division="+(x/y));
}
}
 
/*
Compile:- C:\Users\rahul\OneDrive\Documents>javac Calc.java

Run:-C:\Users\rahul\OneDrive\Documents>java Calc.java
Output:-
Enter number
 1 for Addition
2 for Subtraction
3 for multiplication and
4 for Division
2
Enter the first No=
5
Enter the Second No=
2
Subtraction=3

*/