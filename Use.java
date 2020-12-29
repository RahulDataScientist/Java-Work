// Write a program to create a package.
// Write a program which uses different packages
//by Rahul nyati
package math;
//how to use the addition class of package math
class Use
{
public static void main(String []args)
{
//create object of addition class
math.addition obj =new math.addition(5,4);
obj.sum();
}
}



class addition
{
private int a1,a2;
public addition(int a,int b)
{
a1=a;
a2=b;
}
public void sum()//method to find sum
{
System.out.println("Sum="+(a1+a2));
}
}
//how to use the addition class of package math
 
